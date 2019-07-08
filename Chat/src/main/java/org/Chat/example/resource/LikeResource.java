package org.Chat.example.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.Chat.example.beans.Like;
import org.Chat.example.beans.Post;
import org.Chat.example.database.Databse;

public class LikeResource
{
   private List<Post> posts=Databse.getPosts();
   
   
   public List<Like> getAllLikes(int po_id)
   {
	   List<Like> likes=new ArrayList<>();
	   for(Post post:posts)
	   {
		   if(post.getPostId()==po_id)
			   likes=post.getLikes();
	   }
	   return likes;
   }
   
   public List<Like> addLike(Like like, int po_id)
   {
	   List<Like> likes=new ArrayList<>();
	   for(Post post:posts)
	   {
		   if(post.getPostId()==po_id)
		   {
			   likes=post.getLikes();
			   like.setLkId(likes.size()+1);
			   likes.add(like);
		   }
	   }
	   return likes;
   }
   
   public Like findLike(int po_id,int lk_id)
   {
	   List<Like> likes=new ArrayList<>();
	   for(Post post:posts)
	   {
		   if(post.getPostId()==po_id)
		   {
			   likes=post.getLikes();
			   for(Like like:likes)
			   {
				   if(like.getLkId()==lk_id)
					   return like;
			   }
			   return null;
		   }
		   return null;
	   }
	   return null;
   }
   
   public List<Like> delete_a_Like(int poId,int lId)
   {
	   ErrorMessage ermsg=new ErrorMessage("resourse can not be found , delete operation failed",404,"www.deleteoperationfailed.com");
	   Response resp=Response.status(Status.NOT_FOUND).entity(ermsg).build();
	   
	   
	   List<Like> likes=new ArrayList<>();
	   for(Post post:posts)
	   {
		   if(post.getPostId()==poId)
		   {
			   likes=post.getLikes();
			   Iterator<Like> itr=likes.iterator();
			   while(itr.hasNext())
			   {
				   Like like=itr.next();
				   if(like.getLkId()==lId)
				   {
					   System.out.println("found like");
					   itr.remove();
					   break;
				   }
			   }
			   
		   }
		   return likes;
	   }
	   throw new WebApplicationException(resp);
   }
}
