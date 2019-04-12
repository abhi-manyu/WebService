package org.REST_CRUD.example.services;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.REST_CRUD.example.BundleClass.CountryBundle;
import org.REST_CRUD.example.beans.Country;

@Path("/countries")
public class Country_Service
{
	private static List<Country> li;
	CountryBundle cb;
	
	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Country> getAllList()
	{
		cb=new CountryBundle();
		li=cb.getAllCountryList();
		return li;
	}
	
	@Path("/add")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Country> addToCountryList()
	{
		cb=new CountryBundle();
		li=cb.addToList();
		return li;
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Country findSingleCountry(@PathParam("id")int cID)
	{
		Iterator<Country> itr=li.iterator();
		while(itr.hasNext())
		{
			Country co=itr.next();
			if(cID==co.getcID())
			{
				return co;
			}
		}
		return new Country(0, null, null, 0);
	}
	
	
	@Path("delete")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Country> deleteCountry() throws InterruptedException
	{
		cb=new CountryBundle();
		Map<String,List<Country>> m=cb.deleteFromList();
		Set<String> s=m.keySet();
		for(String key:s)
		{
			if(key.equals("success"))
			{
				li=m.get(key);
			}
		}
		return li;
	}
	
	@Path("/update")
	@GET
	@Produces("text/html")
	public Response updateData()
	{
		String previous;
		cb=new CountryBundle();
		Country co=cb.updateData();
			previous="<html><body>"
					+"<h2>The List has been updated : </h2><hr>"
					+ "id : "+co.getcID()+"<br>"
					+ "name : "+co.getcName()+"<br>"
					+ "capital : "+co.getCapital()+"<br>"
					+ "population : "+co.getPopulation()+"<br>"
					+ "</body></html>";
		return Response.status(200).entity(previous).build();
	}
	
	
}
