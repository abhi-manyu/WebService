package org.java_brains.project.services;

import java.net.URI;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;


@Path("/demo")
@Produces(MediaType.TEXT_PLAIN)
public class DemoClass
{
	@GET
	@Path("/showdemo")
  public String getDemoOnAnnotation(@HeaderParam("username")String username,
		                            @HeaderParam("password")String password)
  {
	  if(username.equals("abhi") && password.equals("manyu"))
	  {
		  return "logged in successfully ";
	  }
	  return "login failed ";
  }
	
	
	
	@GET
	@Path("/context")
	public String contextexample(@Context UriInfo info,@Context HttpHeaders headers)
	{
		String path= "the path is : "+info.getPath();
		return path;
	}
	
	
	
}
