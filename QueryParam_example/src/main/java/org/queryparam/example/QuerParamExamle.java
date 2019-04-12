package org.queryparam.example;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/persons")
public class QuerParamExamle
{
   @GET
   @Path("desi")
   @Produces("text/html")
   public Response getDesiPersonByQueryParam(@QueryParam("naaaam")String name,
   @QueryParam("addr")String address)
   {
	  String output="hello,,i m from ur own country \n my name is : "+name+" and "
	  		+ "\n i m from : "+address;
	  return Response.status(200).entity(output).build();
   }
   
   @GET
   @Path("nri")
   @Produces("text/html")
   public Response getNriPersonByQueryParam(@QueryParam("naaaam")String name,
		   @QueryParam("addr")String address)
   {
	   String output="hello i m a nri , \n and my name  is : "+name+", \n "
	   		+ "and address is : "+address;
	   return Response.status(200).entity(output).build();
   }
}
