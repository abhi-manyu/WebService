package org.java_brains.project.resources;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.java_brains.project.beans.Message;
import org.java_brains.project.database.Database;

public class MessageResource
{
  
	private Map<Long,Message> messages=Database.getMessages();
   
   public MessageResource()
   {
	   messages.put(1l,new Message(1,"this is the first message","ABC"));
	   /*messages.put(2l,new Message(2,"this is the second message","PQR"));
	   messages.put(3l,new Message(3,"this is the third message","XYZ"));*/
   }
   
   public List<Message> getAllMessages()
   {
	   System.out.println("all message method hitted");
	   return new ArrayList<Message>(messages.values());
   }
   
   public Message getMessage(Long id)
   {
	   System.out.println("ur message cre3ated in : "+messages.get(id).getMessageCretionDate());
	   return messages.get(id);
   }
   
   public Message addMessage(Message message)
   {
	   message.setMessageID(messages.size()+1);
	   messages.put(message.getMessageID(), message);
	   return message;
   }
   
   public Message updateMessage(Message message)
   {
	   if(message.getMessageID()<=0)
		   return null;
	   messages.put(message.getMessageID(), message);
	   return message;
   }
   
   public Message removeMessage(long id)
   {
	   return messages.remove(id);
   }
   
   
   public List<Message> getYearlyFilteredMessage(int year)
   {
	   List<Message> yearlyMessage=new ArrayList<Message>();
	   Calendar cal=Calendar.getInstance();
	   for(Message msg : messages.values())
	   {
		   cal.setTime(msg.getMessageCretionDate());
		   if(cal.get(Calendar.YEAR)==year)
		   {
			   yearlyMessage.add(msg);
		   }
	   }
	   return yearlyMessage;
   }
   
   //for pagination
   public List<Message> getPaginatedMessage(int start, int size)
   {
	   ArrayList<Message> alist=new ArrayList<Message>(messages.values());
	   if(start+size>alist.size())
		   return new ArrayList<Message>();
	   return alist.subList(start, start+size);
	   
   }
   
   public List<Message> getMessageByYear_Sendername(int year,String senderName)
   {
	   ArrayList<Message> filteredMessageList=new ArrayList<Message>();
	   Calendar cal=Calendar.getInstance();
	   for(Message mesg:messages.values())
	   {
		   cal.setTime(mesg.getMessageCretionDate());
		   if(cal.get(Calendar.YEAR)==year && 
				   mesg.getSenderName().equalsIgnoreCase(senderName))
			   filteredMessageList.add(mesg);
	   }
	   return filteredMessageList;
   }
   
   
    
   
}
