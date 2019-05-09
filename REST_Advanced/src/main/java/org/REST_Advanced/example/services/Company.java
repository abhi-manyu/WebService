package org.REST_Advanced.example.services;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/companies/{pathname}")
public class Company
{
	@PathParam("pathname")String pathValue;
	@QueryParam("query")String queryValue;
	
	private int count;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
   public String getCompanies()
   {
		count++;
	   return "it recieved the pathparam as : "+pathValue+""
	   		+ "queryParam as : "+queryValue+" for "+count+" times";
   }
}
