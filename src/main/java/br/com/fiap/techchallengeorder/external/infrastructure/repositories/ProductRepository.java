package br.com.fiap.techchallengeorder.external.infrastructure.repositories;

import br.com.fiap.techchallengeorder.domain.enums.TypeProduct;
import br.com.fiap.techchallengeorder.domain.enums.TypeStatus;
import br.com.fiap.techchallengeorder.external.infrastructure.entities.ProductDB;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductDB, UUID> {

    List<ProductDB> findByTypeProductAndTypeStatus(TypeProduct typeProduct, TypeStatus active);

    ProductDB findAllById(UUID id);
}