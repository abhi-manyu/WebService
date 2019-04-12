package org.webservices_XML_response.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")
public class WebServicesXMLResponse
{
    @Path("/getCustomer/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Customer getCustomer(@PathParam("id")int customID)
    {
    	Customer cust1=new Customer();
    	cust1.setCustID(customID);
    	cust1.setCustName("Maharaja");
    	cust1.setCustAddress("BHUBANESWAR");
    	return cust1;
    }
}
