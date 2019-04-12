package org.java_brains.project.database;

import java.util.HashMap;
import java.util.Map;

import org.java_brains.project.beans.Message;
import org.java_brains.project.beans.Profile;

public class Database
{
   private static Map<Long,Message> messages=new HashMap<Long, Message>();
   private static Map<Long,Profile> profiles=new HashMap<Long, Profile>();
   
   public static Map<Long, Message> getMessages()
     {
	    return messages;
     }
   public static Map<Long, Profile> getProfiles() {
	return profiles;
   }
}
