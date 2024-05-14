package br.com.fiap.ms.order.domain.exception.products;

import br.com.fiap.ms.order.domain.exception.InvalidProcessException;

import java.util.UUID;

public class ProductNotFoundException extends InvalidProcessException {
    private static final String tittle = "Product not found";
    private static final String message = "The product with id %s not found";

    public ProductNotFoundException(UUID id) {
        super(tittle, String.format(message, id));
    }
}
