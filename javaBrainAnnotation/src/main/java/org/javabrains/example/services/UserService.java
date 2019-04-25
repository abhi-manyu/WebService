package org.javabrains.example.services;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.*;

import org.javabrains.example.beans.FilteringBean;
import org.javabrains.example.beans.User;
import org.javabrains.example.manipulation.UserCalculation;

@Path("/users")
public class UserService
{
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	UserCalculation usp=new UserCalculation();
	
   @GET
   @Produces(MediaType.APPLICATION_XML)
   @Path("/all")
   public List<User> getAllLists(@BeanParam FilteringBean filbean)
   {
	   if(filbean.getName()!=null && filbean.getUnm()!=null)
		   return usp.getByName_UserName(filbean.getName(),filbean.getUnm());
	   if(filbean.getName()!=null)
		   return usp.getByName(filbean.getName());
	    return usp.getAllUser();
   }
   
   
   @Path("/add")
   @POST
   @Consumes(MediaType.APPLICATION_XML)
   @Produces(MediaType.APPLICATION_JSON)
   public User addUser(User user)
   {
	   return usp.addUser(user);
   }
}
