package org.SubResource.example.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.SubResource.example.beans.Comment;

public class Comment_Resource_Testing
{
   Map<Integer,Comment> comments;
  public Comment_Resource_Testing()
   {
       comments.put(1,new Comment(1,"this is the first comment","abhi"));
       comments.put(2,new Comment(2,"this is the second comment","manyu"));
   }
  
  public List<Comment> getAllComments(int mid)
  {
	  System.out.println("recieved messaged id as : "+mid);
	  return new ArrayList<Comment>(comments.values());
  }
  
  public Comment getComment(int id)
  {
	  for(Comment cmt:comments.values())
		  
	  {
		  if(cmt.getCommentId()==id)
			  return cmt;
	  }
	  return null;
  }
  
  public Comment addComment(Comment cmt)
  {
	  cmt.setCommentId(comments.size()+1);
	  comments.put(cmt.getCommentId(),cmt);
	  return cmt;
  }
}
