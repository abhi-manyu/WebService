package org.Chat.example.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.Chat.example.beans.Comment;
import org.Chat.example.beans.Post;
import org.Chat.example.database.Databse;

public class CommentResouce
{
   private List<Post> posts=Databse.getPosts();
   
   public List<Comment> getAllComments(int id)
   {
	   for(Post post:posts)
	   {
		   List<Comment> comments;
		   if(post.getPostId()==id)
		   {
			   comments=post.getComments();
			   return comments;
		   }
		   return new ArrayList<Comment>();
	   }
	   return null;
   }
   
   public Comment getComment(int pId,int cId)
   {
	   for(Post post:posts)
	   {
		   List<Comment> comments;
		   if(post.getPostId()==pId)
		   {
			   comments=post.getComments();
			   for(Comment cmt:comments)
			   {
				   if(cmt.getCmtId()==cId)
					   return cmt;
			   }
		   }
	   }
	   return null;
   }
   
   public List<Comment> addComment(int pId,Comment cmt)
   {
	   for(Post post:posts)
	   {
		   List<Comment> comments;
		   if(post.getPostId()==pId)
		   {
			   comments=post.getComments();
			   cmt.setCmtId(comments.size()+1);
			   comments.add(cmt);
			   return comments;
		   }
	   }
	   return null;
   }
   
   public Comment updateComment(int pId,int cId,Comment cmt)
   {
	   for(Post post:posts)
	   {
		   if(post.getPostId()==pId)
		   {
			   List<Comment> comments=post.getComments();
			   Iterator<Comment> itr=comments.iterator();
			   int index=0;
			    while(itr.hasNext())
			    {
			       Comment com=itr.next();
				   if(com.getCmtId()==cId)
				   {
					   index=comments.indexOf(com);
					   itr.remove();
				   }
			   }
			    cmt.setCmtId(cId);
			  comments.add(index,cmt); 
			  return cmt;
		   }
	   }
	   return null;
   }
   
   public List<Comment> deleteComment(int p_id, int c_id)
   {
	   Iterator<Post> itr=posts.iterator();
	   while(itr.hasNext())
	   {
		  Post post=itr.next();
		  List<Comment> comments;
		  if(p_id==post.getPostId())
		  {
			  comments=post.getComments();
			  Iterator<Comment> itr2=comments.iterator();
			  while(itr2.hasNext())
			  {
				  Comment comment=itr2.next();
				  if(comment.getCmtId()==c_id)
					  itr2.remove();
			  }
			  return comments;
		  }
	   }
       return null;   
   }
   
   
   
}
