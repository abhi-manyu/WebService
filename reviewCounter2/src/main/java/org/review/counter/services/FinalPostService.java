package org.review.counter.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.review.counter.Database.PostDatabase;
import org.review.counter.beans.Post;

@Path("/posts")
public class FinalPostService
{
	PostDatabase pd=new PostDatabase();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Post> getAllPosts()
	{
		return pd.returnAllPosts();
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Post getOnePost(@PathParam("id")int postId)
	{
		 return pd.getSinglePost(postId);
	}
	
	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Post addPost(Post po)
	{
		pd.addPost(po);
		return po;
	}
	
}
