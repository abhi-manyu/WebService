package org.RESTful.model;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
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
   
   @GET
   @Produces(MediaType.TEXT_PLAIN)
   public Response displayDetails(@QueryParam("name")String name,
		                           @QueryParam("age")int age)
   {
	   String info="name is : "+name+" and the age is : "+age;
	   return Response.status(200).entity(info).build();
   }
   
}
