package org.javabrains.example.database;

import java.util.HashMap;
import java.util.Map;

import org.javabrains.example.beans.User;

public class UserDatabase
{
    private static Map<Long,User> users=new HashMap<Long, User>();
    
    public static void setUsers(Map<Long,User> users) {
		UserDatabase.users = users;
	}
    
    public static Map<Long,User> getUsers() {
		return users;
	}
}
