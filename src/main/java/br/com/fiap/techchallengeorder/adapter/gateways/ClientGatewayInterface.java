package br.com.fiap.techchallengeorder.adapter.gateways;

import br.com.fiap.techchallengeorder.domain.exception.client.ClientNotFoundException;
import br.com.fiap.techchallengeorder.domain.exception.client.InvalidClientProcessException;
import br.com.fiap.techchallengeorder.application.dto.client.ClientDto;
import br.com.fiap.techchallengeorder.domain.model.Client;
import br.com.fiap.techchallengeorder.external.infrastructure.entities.ClientDB;

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