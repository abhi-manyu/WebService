package org.Chat.example.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.Chat.example.beans.Comment;
import org.Chat.example.beans.Post;
import org.Chat.example.database.Databse;

public class PostResource
{
   private List<Post> posts=Databse.getPosts();
   
   
   /*public PostResource()
  {
	   if(posts.size()==0)
	   {
	Post ps=new Post(1,"i m abhi","abhi");
    Comment c1=new Comment(1,"this is first comment","abhi");
    Comment c2=new Comment(2,"this is second comment","arabinda");
    Comment c3=new Comment(3,"this is third comment","anshuraj");
    List<Comment> comments=new ArrayList<>();
    comments.add(c1);
    comments.add(c2);
    comments.add(c3);
    ps.setComments(comments);
    posts.add(ps);
	   }
}*/
   
   
   
   
   public List<Post> getAllPosts()
   {
	   return posts;
   }
   
   public Post getPost(int id)
   {
	   for(Post post:posts)
	   {
		   if(post.getPostId()==id)
			   return post;
	   }
	   return null;
   }
   
   public List<Post> addPost(Post post)
   {
	   
	  for(Post temp_post : posts)
	  {
		  if(temp_post.getPostId()==post.getPostId())
			  post.setPostId(posts.size()+1);
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
