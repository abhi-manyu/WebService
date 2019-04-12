package org.JSON.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.JSON.example.beans.Customer;

@Path("/jsonobject")
public class JSON_Object_BywebServices
{
    @Path("/{cusNo}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Customer getJsonObjectByWebServices(@PathParam("cusNo")int cno)
    {
    	Customer cust=new Customer();
    	cust.setCustId(cno);
    	cust.setCustName("Maharaja");
    	cust.setCustAddress("Hydrabad");
    	
    	return cust;
    }
    
}
