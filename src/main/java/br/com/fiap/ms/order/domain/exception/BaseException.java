package br.com.fiap.ms.order.domain.exception;

public class BaseException extends RuntimeException {
    public BaseException(String message) {
        super(message);
    }
}