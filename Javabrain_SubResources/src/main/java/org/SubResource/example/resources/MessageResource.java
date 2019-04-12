package org.SubResource.example.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.SubResource.example.Database.MessageDatabase;
import org.SubResource.example.beans.Comment;
import org.SubResource.example.beans.Message;

public class MessageResource
{
   Map<Integer,Message> msgs=MessageDatabase.getMsgs();
   
   public MessageResource()
    {
	   Comment com1=new Comment(1,"first Comment","abhimanyu");
	   Map<Integer,Comment> comment=new HashMap<Integer, Comment>();
	   comment.put(1,com1);
	   Message msg=new Message(1,"this is the first msg","first");
	   msg.setComments(comment);
	   msgs.put(1,msg);
    }
   
   public List<Message> getAllMessages()
   {
	   return new ArrayList<Message>(msgs.values());
   }
   
   public List<Message> findBySender(String sendernm)
   {
	   ArrayList<Message> bysender=new ArrayList<Message>();
	   for(Message msg:msgs.values())
	   {
		   if(msg.getSenderName().equalsIgnoreCase(sendernm))
			   bysender.add(msg);
	   }
	   return bysender;
   }
   
   public Message getMessage(int msgid)
   {
	   for(Message msg:msgs.values())
	   {
		   if(msg.getId()==msgid)
			   return msg;
	   }
	   return null;
   }
   
}
