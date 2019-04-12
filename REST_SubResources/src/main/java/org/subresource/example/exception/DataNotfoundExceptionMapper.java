package org.subresource.example.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.subresource.example.beans.ErrorMessage;

@Provider
public class DataNotfoundExceptionMapper implements 
                               ExceptionMapper<DataNotFoundException>
{

	public Response toResponse(DataNotFoundException exc)
	{
		ErrorMessage ermsg=
				    new ErrorMessage(exc.getMessage(),404,"https://www.google.com");
		
		
	     return Response.status(Status.NOT_FOUND)
	    		 .entity(ermsg).build();
	}
	
}
