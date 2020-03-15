package org.messenger.example.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.messenger.example.beans.Message;
import org.messenger.example.database.MessageDatabase;

public class MessageResource
{
	
	private Map<Integer,Message> messages=MessageDatabase.getMessages();
	
	public MessageResource() {
		Message m1=new Message(1, "Hello World","Abhimanyu");
		Message m2=new Message(2, "Welcome","Arabinda");
		Message m3=new Message(3, "Happy maha siv ratri","Anshuraj");
		messages.put(1,m1);
		messages.put(2,m2);
		messages.put(3,m3);
	}
      
      public  List<Message> getAllMessages()
      {
    	  return new ArrayList<Message>(messages.values());
      }
}
