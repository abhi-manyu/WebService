package org.subresource.example.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.subresource.example.beans.Post;
import org.subresource.example.resources.Post_Resources;

@Path("/posts")
public class PostService
{
	
	Post_Resources pr=new Post_Resources();
	
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Post> getAllPosts()
    {
    	return pr.getAllPosts();
    }
    
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Post addPosts(Post post)
    {
    	return pr.addPost(post);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post getPost(@PathParam("id")long poid)
    {
    	return pr.getPost(poid);
    }
}
