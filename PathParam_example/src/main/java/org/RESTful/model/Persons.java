package org.RESTful.model;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/persons")
public class Persons
{
   @Path("/{name}/{address}")
   @GET
   @Produces("text/html")
   public Response addPerson(@PathParam("name")String name,
		   @PathParam("address")String address)
   {
	   String output="<html><body>person added as : <br>"
	   		    +"name : <span style='color:red'>"+name+"</span><br>"
	   		    +"address : <span style='color : red'>"+address+"</span><br>"
			   + "</body><html>";
	   
	   return Response.status(200).entity(output).build();
   }
}
