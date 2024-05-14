package br.com.fiap.ms.order.domain.exception.products;

import br.com.fiap.ms.order.domain.exception.InvalidProcessException;

public abstract class InvalidProductsProcessException extends InvalidProcessException {

    public InvalidProductsProcessException(String tittle, String message) {
        super(tittle, message);
    }
}
