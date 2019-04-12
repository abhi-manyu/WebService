package org.review.counter.services;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.review.counter.Database.PostDatabase;
import org.review.counter.beans.Post;

@Path("/posts")
public class PostServices
{
	 private static List<Post> li;
	 PostDatabase pd1;
	
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response allPosts()
    {
    	pd1=new PostDatabase();
    	li= pd1.returnAllPosts();
    	String msg2="<html><body>";
    	Iterator<Post> itr2=li.iterator();
    	while(itr2.hasNext())
    	{
    		Post pos=itr2.next();
    		msg2+="post id--"+pos.getPostID()+"<br>post name--"+pos.getPost()+
    				"<br>sender name--"+pos.getPoster_Name()+"<hr>";
    	  System.out.println(li);
    	}
    	 msg2+="</body></html>";
    	return Response.status(200).entity(msg2).build();
    }
    
    @Path("/{postid}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getSinglePost(@PathParam("postid")int id)
    {
    	pd1=new PostDatabase();
    	Post pos=pd1.getSinglePost(id);
    	if(pos!=null)
    	{
    		String msg="<html><body>";
    		msg+="<h1>post retrived successfully</h2>"
    				+ "post id : "+id+"<br>post : "+pos.getPost()+"<br>"
    						+ "poster name : "+pos.getPoster_Name()+"<br>posting date : "+
    				pos.getPostingDate()+"</body></html>";
    		return Response.status(200).entity(msg).build();
    	}
    	else
    	{
    		String msg="<html><body><font style='color:red'>"
    				+ "no post found with this id : "+id+" (try with a valid id)"
    						+ "</font></body></html>";
    		return Response.status(200).entity(msg).build();
    	}
    }
    
}
