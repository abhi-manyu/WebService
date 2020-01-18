package org.Chat.example.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Chat.example.beans.Post;
import org.Chat.example.resource.PostResource;

@Path("/posts")
public class PostService
{
	PostResource pr=new PostResource();
	
   @GET
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   public List<Post> getAllPosts()
   {
	   return pr.getAllPosts();
   }
   
   @Path("/{id}")
   @GET
   //@Produces(MediaType.APPLICATION_JSON)
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   public Post getPost(@PathParam("id")int id)
   {
	   return pr.getPost(id);
   }
   
   @Path("/add")
   @POST
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   public List<Post> addPost(Post post)
   {
	   return pr.addPost(post);
   }
 
   @PUT
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   @Path("/{id}")
   public Post updatePost(@PathParam("id")int id,Post post)
   {
	   return pr.updatePost(id,post);
   }
   
   @DELETE
   @Path("/{id}")
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
   public List<Post> deletePost(@PathParam("id")int id)
   {
	   return pr.deletePost(id);
   }
   
   @Path("/{id}/comments")
   public CommentService getCommentService()
   {
	   return new CommentService();
   }
   
   @Path("/{id}/likes")
   public LikeService getLikeService()
   {
	   return new LikeService();
   }
   
   
}
