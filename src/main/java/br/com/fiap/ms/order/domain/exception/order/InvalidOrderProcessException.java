package br.com.fiap.ms.order.domain.exception.order;

import br.com.fiap.ms.order.domain.exception.InvalidProcessException;

public abstract class InvalidOrderProcessException extends InvalidProcessException {

    public InvalidOrderProcessException(String tittle, String message) {
        super(tittle, message);
    }
}
