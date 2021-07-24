package com.matheus.exceptions.vo;

import com.matheus.exceptions.InsufficientAmountException;

import java.io.Serializable;
import java.time.LocalDateTime;

public final class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = -9091727113217130791L;

    private final int code;
    private final String message;
    private final LocalDateTime timestamp;

    public ExceptionResponse(int code, String message, LocalDateTime timestamp) {
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
    }

    public static ExceptionResponse from(InsufficientAmountException exception) {
        return new ExceptionResponse(1000, exception.getMessage(), LocalDateTime.now());
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
