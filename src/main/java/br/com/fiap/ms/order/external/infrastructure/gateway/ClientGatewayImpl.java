package br.com.fiap.ms.order.external.infrastructure.gateway;

import br.com.fiap.ms.order.adapter.gateways.ClientGatewayInterface;
import br.com.fiap.ms.order.application.dto.client.ClientDto;
import br.com.fiap.ms.order.domain.exception.client.ClientAlreadyExistsException;
import br.com.fiap.ms.order.domain.exception.client.ClientNotFoundException;
import br.com.fiap.ms.order.domain.exception.client.InvalidClientProcessException;
import br.com.fiap.ms.order.domain.model.Client;
import br.com.fiap.ms.order.domain.utils.ValidCPF;
import br.com.fiap.ms.order.external.infrastructure.entities.ClientDB;
import br.com.fiap.ms.order.external.infrastructure.repositories.ClientRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ClientGatewayImpl implements ClientGatewayInterface {

    private static final Logger logger = LoggerFactory.getLogger(ClientGatewayImpl.class);

    private final ClientRepository clientRepository;

    @Autowired
    public ClientGatewayImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }


    @Override
    public ClientDto register(Client client) throws InvalidClientProcessException {
        return null;
    }

    @Override
    public ClientDto update(ClientDto clientDto) throws InvalidClientProcessException {
        return null;
    }

    @Override
    public ClientDto delete(String cpf) throws ClientNotFoundException {
        return null;
    }

    @Override
    public List<ClientDto> listFindAll() {
        return null;
    }

    @Override
    public ClientDto findByCpf(String cpf) throws InvalidClientProcessException {
        return null;
    }

    @Override
    public ClientDto findByDocument(String cpf) throws ClientNotFoundException {
        return null;
    }

    public Optional<ClientDB> findById(UUID clientId){
        return this.clientRepository.findById(clientId);
    }

}