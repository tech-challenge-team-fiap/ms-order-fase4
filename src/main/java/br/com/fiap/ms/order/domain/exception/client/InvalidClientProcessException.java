package br.com.fiap.ms.order.domain.exception.client;

import br.com.fiap.ms.order.domain.exception.InvalidProcessException;

public abstract class InvalidClientProcessException extends InvalidProcessException {

    public InvalidClientProcessException(String tittle, String message) {
        super(tittle, message);
    }
}
