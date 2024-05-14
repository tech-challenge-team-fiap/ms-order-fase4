package br.com.fiap.ms.order.adapter.gateways;

import br.com.fiap.ms.order.domain.exception.client.ClientNotFoundException;
import br.com.fiap.ms.order.domain.exception.client.InvalidClientProcessException;
import br.com.fiap.ms.order.application.dto.client.ClientDto;
import br.com.fiap.ms.order.domain.model.Client;
import br.com.fiap.ms.order.external.infrastructure.entities.ClientDB;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientGatewayInterface {

    ClientDto register(Client client) throws InvalidClientProcessException;

    ClientDto update(ClientDto clientDto) throws InvalidClientProcessException;

    ClientDto delete(String cpf) throws ClientNotFoundException;

    List<ClientDto> listFindAll();

    ClientDto findByCpf(String cpf) throws InvalidClientProcessException;

    ClientDto findByDocument(String cpf) throws ClientNotFoundException;

    Optional<ClientDB> findById(UUID clientId);
}