package com.matheus.resource;

import com.matheus.exceptions.InsufficientAmountException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;

@Path("/accounts")
public class AccountResource {

    @GET
    @Path("/debit/{amount}")
    public Response debit(@PathParam("amount") BigDecimal amount) throws InsufficientAmountException {

        BigDecimal actualBalance = BigDecimal.TEN;

        if (actualBalance.compareTo(amount) < 0) {
            throw new InsufficientAmountException("Insufficient amount");
        }

        return Response.ok(actualBalance.subtract(amount)).build();
    }
}
