package org.SubResource.example.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.SubResource.example.beans.Comment;
import org.SubResource.example.beans.Message;
import org.SubResource.example.resources.CommentResource;

@Path("/")
public class CommentService
{
	
	CommentResource cores=new CommentResource();
	
   @GET
   @Produces(MediaType.APPLICATION_XML)
   public List<Comment> getAllComments(@PathParam("mid")int mesgId)
   {
	   System.out.println("request reached over here and forwarding with msg id : "+mesgId);
	   return cores.getAllComments(mesgId);
   }
   
   
   @POST
   @Path("/add")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Comment addComment(@PathParam("mid")int mesgId,Comment cmt)
   {
	   System.out.println("sending request");
	   return cores.addComment(mesgId, cmt);
   }
}
