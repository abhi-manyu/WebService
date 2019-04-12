package org.SubResource.example.Database;

import java.util.HashMap;
import java.util.Map;

import org.SubResource.example.beans.Message;

public class MessageDatabase
{
    private static Map<Integer,Message> msgs=new HashMap<Integer, Message>();
    
    public static void setMsgs(Map<Integer, Message> msgs) {
		MessageDatabase.msgs = msgs;
	}
    public static Map<Integer, Message> getMsgs() {
		return msgs;
	}
}
