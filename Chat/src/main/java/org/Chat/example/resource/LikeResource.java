package org.Chat.example.resource;

import java.util.ArrayList;
import java.util.List;

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
}
