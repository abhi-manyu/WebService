package org.Customers.example.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Customers.example.beans.Customer;
import org.Customers.example.resource.CustomerResource;

@Path("/customers")
public class CustomerService
{
   CustomerResource cr=new CustomerResource();
   
   @GET
   @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
   public List<Customer> getAllCustomers()
   {
	   return cr.getAllCustomers();
   }
   
   @POST
   @Path("/add")
   @Consumes(MediaType.APPLICATION_XML)
   @Produces(MediaType.APPLICATION_XML)
   public List<Customer> addCustomer(Customer customer)
   {
	   return cr.addCustomer(customer);
   }
   
   @GET
   @Path("/{id}")
   @Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
   public Customer getCustomer(@PathParam("id")int cust_id)
   {
	   return cr.getCustomer(cust_id);
   }
   
   @Path("/{id}/vendors")
   public VendorService getVendorService()
   {
	   return new VendorService();
   }
   
}
