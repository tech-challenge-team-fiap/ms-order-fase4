package br.com.fiap.techchallengeorder.application.service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ConsumerSQS {

    private final AmazonSQS amazonSQSClient;

    public ConsumerSQS(AmazonSQS amazonSQSClient) {
        this.amazonSQSClient = amazonSQSClient;
    }

    @Scheduled(fixedDelay = 5000) // It runs every 5 seconds.
    public void consumeMessages() {
        try {
            String queueUrl = amazonSQSClient.getQueueUrl("payments-error").getQueueUrl();

            ReceiveMessageResult receiveMessageResult = amazonSQSClient.receiveMessage(queueUrl);

            if (!receiveMessageResult.getMessages().isEmpty()) {
                com.amazonaws.services.sqs.model.Message message = receiveMessageResult.getMessages().get(0);
                log.info("Read Message from queue: {}", message.getBody());

                //Colocar repo do produto, buscando por ID produto.

                //update do produto

                amazonSQSClient.deleteMessage(queueUrl, message.getReceiptHandle());
            }

        } catch (Exception e) {
            log.error("Queue Exception Message: {}", e.getMessage());
        }
    }
}
