package br.com.fiap.ms.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.fiap.techchallenge"})
@EntityScan(basePackages = "br.com.fiap.techchallenge.external.infrastructure.entities")
public class OrderMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMSApplication.class, args);
	}

}
