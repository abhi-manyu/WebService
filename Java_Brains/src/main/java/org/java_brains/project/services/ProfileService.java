package org.java_brains.project.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.java_brains.project.beans.Profile;
import org.java_brains.project.resources.Profileresource;

@Path("/profiles")
public class ProfileService
{
	Profileresource presource=new Profileresource();
	
	
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public List<Profile> getAllProfiles(@QueryParam("address")String address,
		                               @QueryParam("fname")String fname,
		                               @QueryParam("lname")String lname)
   {
	   if(address!=null && fname!=null && lname!=null)
		   return presource.filterByEverything(address, fname, lname);
	   if(address!=null && fname!=null)
		   return presource.filterByName_Address(address, fname);
	   if(address!=null && lname!=null)
		   return presource.filterBylName_Address(address, lname);
	   if(fname!=null && lname!=null)
		   return presource.filterByfName_and_lName(fname, lname);
	   if(fname!=null || lname!=null)
		   return presource.filterByfName_or_lName(fname, lname);
	   if(address==null)
	       return presource.getAllProfiles();
	   return presource.getFilteredByYear(address);
   }
   
   
   @GET
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_XML)
   public Profile getProfile(@PathParam("id")long proID)
   {
	   return presource.getProfile(proID);
   }
   
   
   @POST
   @Path("/add")
   @Consumes(MediaType.APPLICATION_XML)
   @Produces(MediaType.APPLICATION_JSON)
   public Profile addProfile(Profile profile)
   {
	  return presource.addProfile(profile);
   }
   
   
   @PUT
   @Path("/{id}")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Profile updateProfile(@PathParam("id")long proID,Profile profile)
   {
	   profile.setProfileId(proID);
	   return presource.updateProfile(profile);
   }
   
   
   @DELETE
   @Produces(MediaType.TEXT_PLAIN)
   @Path("/{id}")
   public String deleteProfiles(@PathParam("id")long delID)
   {
	   presource.deleteProfile(delID);
	   return "deleted successsfully";
   }
   
}
