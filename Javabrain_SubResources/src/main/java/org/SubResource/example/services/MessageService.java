package org.SubResource.example.services;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.SubResource.example.beans.FilterBean;
import org.SubResource.example.beans.Message;
import org.SubResource.example.resources.Comment_Resource_Testing;
import org.SubResource.example.resources.MessageResource;

@Path("/messages")
public class MessageService
{
	MessageResource mrc=new MessageResource();
	
	
   @Path("/all")
   @Produces(MediaType.APPLICATION_JSON)
   @GET
   public List<Message> getAllMessage(@BeanParam FilterBean filbean)
   {
	   if(filbean.getSendernm() !=null)
		   return mrc.findBySender(filbean.getSendernm());
	   return mrc.getAllMessages();
   }
   
   
   @GET
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_JSON)
   public Message getmessage(@PathParam("id")int msgid)
   {
	   return mrc.getMessage(msgid);
   }
   
   
   @Path("{mid}/comments")
   public CommentService goToCommentService()
   {
	   return new CommentService();
   }
   
}
