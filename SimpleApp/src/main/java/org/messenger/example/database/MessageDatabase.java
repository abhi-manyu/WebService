package org.messenger.example.database;

import java.util.HashMap;
import java.util.Map;

import org.messenger.example.beans.Message;

public class MessageDatabase 
{
      private static Map<Integer,Message> messages=new HashMap<Integer, Message>();
      public static void setMessages(Map<Integer, Message> messages) {
		MessageDatabase.messages = messages;
	}
      public static Map<Integer, Message> getMessages() {
		return messages;
	}
}
