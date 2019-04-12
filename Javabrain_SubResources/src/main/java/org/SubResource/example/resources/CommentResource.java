package org.SubResource.example.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.SubResource.example.Database.MessageDatabase;
import org.SubResource.example.beans.Comment;
import org.SubResource.example.beans.Message;

public class CommentResource
{
   private Map<Integer,Message> messages=MessageDatabase.getMsgs();
   
   
   public List<Comment> getAllComments(int msgID)
   {
	   System.out.println("request reached at commentresource with msg id : "+msgID);
	   return new ArrayList<Comment>(messages.get(msgID).getComments().values());
   }
   public Comment addComment(int msgId,Comment cmt)
   {
	   Map<Integer,Comment> comments=messages.get(msgId).getComments();
	   cmt.setCommentId(comments.size()+1);
	   comments.put(cmt.getCommentId(),cmt);
	   System.out.println("commented successfully");
	   return cmt;
   }
   
}
