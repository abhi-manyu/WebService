package org.Country_Capital_Example.example.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Country_Capital_Example.example.beans.Country_Capital;

@Path("/country/capital")
public class Country_Capital_Service
{
    @Path("/getCountryCapitalList")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Country_Capital> getAllList()
    {
    	List<Country_Capital> li;
    	li=createList();
    	return li;
    }
    
    @Path("/{cid}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Country_Capital getSingleData(@PathParam("cid")int cID)
    {
    	List<Country_Capital> li;
    	li=createList();
    	Iterator<Country_Capital> itr=li.iterator();
    	while(itr.hasNext())
    	{
    		Country_Capital c=itr.next();
    		if(cID==c.getCountID())
    			return c;
    	}
    	Country_Capital c=new Country_Capital(0, null, null);
    	return c;
    }
    
    //dummy methods to create a list of countries and capitals
    private List<Country_Capital> createList()
    {
    	Country_Capital c1=new Country_Capital(4454,"India","Delhi");
    	Country_Capital c2=new Country_Capital(3465,"Nepal","Kathmandu");
    	Country_Capital c3=new Country_Capital(35457,"Thailand","Bangkok");
    	Country_Capital c4=new Country_Capital(1638,"China","Beijing");
    	
    	List<Country_Capital> li=new ArrayList<Country_Capital>();
    	li.add(c1);
    	li.add(c2);
    	li.add(c3);
    	li.add(c4);
    	
    	return li;
    }
    
}
