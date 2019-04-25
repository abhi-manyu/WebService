package org.javabrains.example.manipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.javabrains.example.beans.User;
import org.javabrains.example.database.UserDatabase;

public class UserCalculation
{
	Map<Long,User> users=UserDatabase.getUsers();
	
   public UserCalculation()
    {
	    User u1=new User(101,"sdgdfg","sdhfj@hjdf.com","sdfgt","sdgfdg","hydrabad");
	    users.put(1l,u1);
    }
   
   
   public List<User> getAllUser()
   {
	  return new ArrayList<User>(users.values());
   }
   public List<User> getByName(String name)
   {
	   ArrayList<User> byname=new ArrayList<User>();
	   for(User user:users.values())
	   {
		   if(user.getName().equalsIgnoreCase(name))
			   byname.add(user);
	   }
	   return byname;
   }
   
   
   public List<User> getByName_UserName(String name,String unm)
   {
	   ArrayList<User> byname_unm=new ArrayList<User>();
	   for(User user:users.values())
	   {
		   if(user.getName().equalsIgnoreCase(name) &&
				   user.getUserName().equalsIgnoreCase(unm))
			   byname_unm.add(user);
	   }
	   return byname_unm;
   }
   
   
   
   public User addUser(User user)
   {
	   user.setId(users.size()+1);
	   users.put(user.getId(),user);
	   return user;
   }
   
   
}
