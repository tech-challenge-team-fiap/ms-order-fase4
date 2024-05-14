package br.com.fiap.ms.order.adapter.gateways;

import br.com.fiap.ms.order.domain.exception.products.InvalidProductsProcessException;
import br.com.fiap.ms.order.application.dto.product.ProductDto;
import br.com.fiap.ms.order.domain.model.Product;
import br.com.fiap.ms.order.external.infrastructure.entities.ProductDB;

import java.util.List;
import java.util.UUID;

public interface ProductGatewayInterface {

    ProductDto register(Product product) throws Exception;

    List<ProductDB> findByProductType(String type) throws InvalidProductsProcessException;

    ProductDto edit(ProductDB product);

    ProductDto remove(ProductDB product);

    List<ProductDB> findAll();

    ProductDB findById(UUID id);
}