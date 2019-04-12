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
import org.SubResource.example.resources.Comment_Resource_Testing;

@Path("/test")
public class Comment_Service_Testing
{
	
	Comment_Resource_Testing crt=new Comment_Resource_Testing();
	
	
     @GET
     @Produces(MediaType.APPLICATION_JSON)
     public List<Comment> getAllComments(@PathParam("mid")int mid)
     {
    	 System.out.println("all comments method called");
    	 return crt.getAllComments(mid);
     }
     
     
     @GET
     @Path("/{cid}")
     @Produces(MediaType.APPLICATION_JSON)
     public Comment getComment(@PathParam("cid")int cid)
     {
    	 return crt.getComment(cid);
     }
     
     
     @Path("/add")
     @POST
     @Consumes(MediaType.APPLICATION_JSON)
     @Produces(MediaType.APPLICATION_JSON)
     public Comment addComment(Comment cmt)
     {
    	return crt.addComment(cmt);
     }
}
