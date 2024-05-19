package br.com.fiap.techchallengeorder.domain.interfaces;

import br.com.fiap.techchallengeorder.application.dto.product.ProductDto;


import java.util.List;
import java.util.UUID;

public interface ProductUseCaseInterface {

    ProductDto edit(final br.com.fiap.techchallengeorder.application.dto.product.ProductEditFormDto productFormEditDto) throws br.com.fiap.techchallengeorder.domain.exception.products.InvalidProductsProcessException;

    List<ProductDto> findByProductType(String productType) throws br.com.fiap.techchallengeorder.domain.exception.InvalidProcessException;

    List<ProductDto> findAll();

    ProductDto register(final br.com.fiap.techchallengeorder.application.dto.product.ProductFormDto productFormDto) throws br.com.fiap.techchallengeorder.domain.exception.products.InvalidProductsProcessException;

    ProductDto remove(final UUID id) throws br.com.fiap.techchallengeorder.domain.exception.products.InvalidProductsProcessException;
}
