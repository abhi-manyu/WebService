package org.java_brains.project.services;

import java.util.ArrayList;
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

import org.java_brains.project.beans.Message;
import org.java_brains.project.resources.MessageResource;

@Path("/messages")
public class MessageService
{
	MessageResource mresorce=new MessageResource();
	
   @Produces(MediaType.APPLICATION_XML)
   @GET
   //filtering by the Queryparam annotation 
   public List<Message> getAllMessages(@QueryParam("year")int year,
		                               @QueryParam("sender")String sender)
   {
	   if(year>=0 && sender!=null)
		   return mresorce.getMessageByYear_Sendername(year, sender);
	   if(year<=0)
	       return mresorce.getAllMessages();
	   return mresorce.getYearlyFilteredMessage(year);
   }
   
   
   /*//filtering by the path param annotation
   @GET
   @Path("/year/{year}")
   @Produces(MediaType.APPLICATION_JSON)
   public List<Message> getAllMessagesByYear(@PathParam("year")int year)
   {
	  return mresorce.getYearlyFilteredMessage(year);
   }*/
   
   
   
   @Path("/range")
   @Produces(MediaType.APPLICATION_JSON)
   @GET
   public List<Message> getAllMessageinrange(@QueryParam("from")int from,
		                                     @QueryParam("size")int size)
   {
	   if(from<0 || size<0)
		   return new ArrayList<Message>();
	   return mresorce.getPaginatedMessage(from, size);
   }
   
   
   
   
   
   
   
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_XML)
   @GET
   public Message getMessage(@PathParam("id")long mesID)
   {
	   return mresorce.getMessage(mesID);
   }
   
   @Path("/add")
   @POST
   @Consumes(MediaType.APPLICATION_XML)
   @Produces(MediaType.APPLICATION_JSON)
   public Message addMessages(Message message)
   {
	   return mresorce.addMessage(message);
   }
   
   @PUT
   @Path("/{mesID}")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Message updateMessage(@PathParam("mesID")Long mid,Message message)
   {
	   message.setMessageID(mid);
	   return mresorce.updateMessage(message);
   }
   
   
   @DELETE
   @Path("/{id}")
   public String deleteMessage(@PathParam("id")long mesID)
   {
	   mresorce.removeMessage(mesID);
	   return "deleted the messagge with id = "+mesID;
   }
   
}
