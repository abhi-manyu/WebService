package org.Chat.example.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.Chat.example.beans.Comment;
import org.Chat.example.beans.Like;
import org.Chat.example.beans.Post;
import org.Chat.example.database.Databse;

public class PostResource
{
   private List<Post> posts=Databse.getPosts();
   
   
   public PostResource()
  {
	   if(posts.size()==0)
	   {
	Post ps=new Post(1,"i m abhi","abhi");
    Comment c1=new Comment(1,"this is first comment","abhi");
    Comment c2=new Comment(2,"this is second comment","arabinda");
    List<Comment> comments=new ArrayList<>();
    comments.add(c1);
    comments.add(c2);
    ps.setComments(comments);
    
    Like like1=new Like(1,"abhi");
    Like like2=new Like(2,"Arabinda");
    List<Like> likes=new ArrayList<>();
    likes.add(like1);
    likes.add(like2);
    ps.setLikes(likes);
    
    posts.add(ps);
	   }
}
   
   
   
   
   public List<Post> getAllPosts()
   {
	   return posts;
   }
   
   
   
   public Post getPost(int id)
   {
	   ErrorMessage ermsg=new ErrorMessage("requested entity not found",404,
			   "https://www.developer not provided documentetion.com");
	   Response resp=Response.status(Status.NOT_FOUND).entity(ermsg).build();
	   for(Post post:posts)
	   {
		   if(post.getPostId()==id)
			   return post;
	   }
	   throw new WebApplicationException(resp);
	   
   }
   
   public List<Post> addPost(Post post)
   {
	   ErrorMessage errmsg=
			   new ErrorMessage("element already exists, try with some modification",409,
					   "https://www.not_provided_by_developer.com");
	   Response resp=Response.status(Status.CONFLICT).entity(errmsg).build();
	   
	  Iterator<Post> itr=posts.iterator();
	  while(itr.hasNext())
	  {
		  Post temp=itr.next();
		  if(temp.getPostId()==post.getPostId())
			  throw new WebApplicationException(resp);
	  }
	  posts.add(post);
	  return posts;
   }
   
   public Post updatePost(int id,Post post)
   {
	   Iterator<Post> itr=posts.iterator();
	   int index = 0;
	   boolean flag=false;
	   while(itr.hasNext())
	   {
		   Post temp_post=itr.next();
		   if(temp_post.getPostId()==id)
		   {
			   index=posts.indexOf(temp_post);
			   itr.remove();
			   flag=true;
		   }
	   }
	   if(flag==true)
	   {
	      post.setPostId(id);
	      posts.add(index,post);
	      flag=false;
	      return post;
	   }
	   return null;
   }
   
   public List<Post> deletePost(int id)
   {
	   Iterator<Post> itr=posts.iterator();
	   boolean flag=false;
	   while(itr.hasNext())
	   {
		   Post post=itr.next();
		   if(post.getPostId()==id)
		   {
			   itr.remove();
			   flag=true;
		   }
	   }
	   if(flag==true)
	      return posts;
	   return null;
   }
   
   
   
}
