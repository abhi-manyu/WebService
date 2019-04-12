package org.Chat.example.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Chat.example.beans.Comment;
import org.Chat.example.resource.CommentResouce;

@Path("/")
public class CommentService
{
	
	CommentResouce cr=new CommentResouce();
	
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Comment> getAllComments(@PathParam("id")int id)
    {
    	return cr.getAllComments(id);
    }
    
    @GET
    @Path("/{c_id}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Comment getComment(@PathParam("id")int p_id, @PathParam("c_id")int c_id)
    {
    	return cr.getComment(p_id, c_id);
    }
    
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Comment> addComment(@PathParam("id")int id, Comment comment)
    {
    	return cr.addComment(id, comment);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("/{c_id}")
    public Comment updateComment(@PathParam("id")int  p_id,@PathParam("c_id")int c_id,
    		                                           Comment comment)
    {
    	return cr.updateComment(p_id, c_id, comment);
    }
    
    
    
}
