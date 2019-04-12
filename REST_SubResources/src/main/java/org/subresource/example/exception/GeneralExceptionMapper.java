package org.subresource.example.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.subresource.example.beans.ErrorMessage;

public class GeneralExceptionMapper implements ExceptionMapper<Throwable> 
{

	public Response toResponse(Throwable ex)
	{
		ErrorMessage ermsg=
				 new ErrorMessage(ex.getMessage(),500,"https://www.google.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(ermsg).build();
	}

}
