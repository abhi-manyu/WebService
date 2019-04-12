package org.matrixParam.example;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/MatrixParam")
public class MatrixParamExample
{
   @Path("/own")
   @Produces("text/html")
   @GET
   public Response getByMatrixParamownPerson(@MatrixParam("nmmm")String name,
		   @MatrixParam("addd")String address, @MatrixParam("prof")String profession)
   {
	   String output="i m : "+name+" and i m from : "+address+" and i m a : "+profession;
	   return Response.status(200).entity(output).build();
   }
}
