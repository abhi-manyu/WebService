package org.Customers.example.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Customers.example.beans.Vendors;
import org.Customers.example.resource.VendorResource;

@Path("/")
public class VendorService
{
	VendorResource vr=new VendorResource();
	
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Vendors>GetAllVendors(@PathParam("id")int id)
    {
    	return vr.getAllVendors(id);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{venid}")
    public Vendors getVenor(@PathParam("id")int id, @PathParam("venid")int ven_id)
    {
    	return vr.getVendor(id, ven_id);
    }
    
    
    
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    @Path("/add")
    public List<Vendors> addVendors(@PathParam("id")int id ,Vendors vendor)
    {
    	return vr.addVendors(id, vendor);
    }
    
}
