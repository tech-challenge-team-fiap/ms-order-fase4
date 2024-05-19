package br.com.fiap.techchallengeorder.domain.interfaces;

import br.com.fiap.techchallengeorder.application.dto.client.ClientDto;
import br.com.fiap.techchallengeorder.domain.exception.InvalidProcessException;
import br.com.fiap.techchallengeorder.domain.exception.client.ClientNotFoundException;
import br.com.fiap.techchallengeorder.domain.exception.client.InvalidClientProcessException;

import java.util.List;

public interface ClientUseCaseInterface {

    List<ClientDto> findAll();

    ClientDto findByCpf(String cpf) throws InvalidProcessException;

    ClientDto findByDocument(String cpf) throws ClientNotFoundException;

    ClientDto edit(final ClientDto clientDto) throws InvalidClientProcessException;

    ClientDto register(final ClientDto clientDto) throws InvalidClientProcessException;

    ClientDto remove(final String cpf) throws InvalidClientProcessException;
}