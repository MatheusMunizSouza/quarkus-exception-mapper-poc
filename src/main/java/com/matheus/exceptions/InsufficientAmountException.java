package com.matheus.exceptions;

import javax.ws.rs.ext.Provider;
import java.io.Serializable;

@Provider
public class InsufficientAmountException extends Exception implements Serializable {

    private static final long serialVersionUID = -8263462126222299236L;

    public InsufficientAmountException() {
        super();
    }

    public InsufficientAmountException(String message) {
        super(message);
    }

    public InsufficientAmountException(String message, Throwable cause) {
        super(message, cause);
    }
}
