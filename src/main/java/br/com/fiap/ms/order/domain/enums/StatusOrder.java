package br.com.fiap.ms.order.domain.enums;

public enum StatusOrder {

    /**
     * Aguardando Pagamento
     */
    WAITING_PAYMENTS,

    /**
     * Pagamento recebido
     */
    PAYMENTS_RECEIVED,

    /**
     * Em preparo
     */
    IN_PREPARATION,

    /**
     * Recebido
     */
    RECEIVED,

    /**
     * Pronto
     */
    READY,

    /**
     * Finalizado
     */
    FINISHED,

    /**
     * Cancelado
     */
    CANCELED,

    /**
     * Entregue
     */
    DELIVERED
}
