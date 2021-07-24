package com.matheus.exceptions.mappers;

import com.matheus.exceptions.InsufficientAmountException;
import com.matheus.exceptions.vo.ExceptionResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class InsuficientAmountExceptionMapper implements ExceptionMapper<InsufficientAmountException> {

    @Override
    public Response toResponse(InsufficientAmountException exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(ExceptionResponse.from(exception)).build();
    }
}
