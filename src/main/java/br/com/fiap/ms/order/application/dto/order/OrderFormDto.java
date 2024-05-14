package br.com.fiap.ms.order.application.dto.order;

import br.com.fiap.ms.order.application.dto.product.ProductOrderFormDto;
import br.com.fiap.ms.order.domain.enums.PaymentsType;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderFormDto {

    private UUID clientId;

    private PaymentsType paymentsType;

    private List<ProductOrderFormDto> products;
}