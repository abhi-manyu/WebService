package org.java_brains.project.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.java_brains.project.beans.Profile;
import org.java_brains.project.database.Database;

public class Profileresource
{
   private Map<Long,Profile> profiles=Database.getProfiles();
   
  public Profileresource()
   {
	  profiles.put(1l,new Profile(1,"Dark","Knight","South Corolina"));
	  profiles.put(2l,new Profile(2,"Silver","Feast","Berlin"));
	  profiles.put(3l,new Profile(3,"Cap.","America","Nutting Ham"));
   }
  
  public List<Profile> getAllProfiles()
  {
	   return new ArrayList<Profile>(profiles.values());
  }
  
  
  public List<Profile> getFilteredByYear(String address)
  {
	  ArrayList<Profile> filteredprofiles=new ArrayList<Profile>();
	  for(Profile profile:profiles.values())
	  {
		  if(profile.getAddress().equalsIgnoreCase(address))
			   filteredprofiles.add(profile);
	  }
	  return filteredprofiles;
  }
  
  
  public List<Profile> filterByName_Address(String address, String fname)
  {
	  ArrayList<Profile> secFilteredprof=new ArrayList<Profile>();
	  for(Profile prof:profiles.values())
	  {
		  if(prof.getAddress().equalsIgnoreCase(address) && 
				      prof.getFirstName().equalsIgnoreCase(fname))
			  secFilteredprof.add(prof);
	  }
	  return secFilteredprof;
  }
  
  
  
  
  public List<Profile> filterBylName_Address(String address, String lname)
  {
	  ArrayList<Profile> by_add_lname=new ArrayList<Profile>();
	  for(Profile prof:profiles.values())
	  {
		  if(prof.getAddress().equalsIgnoreCase(address) && 
				      prof.getLatsName().equalsIgnoreCase(lname))
			  by_add_lname.add(prof);
	  }
	  return by_add_lname;
  }
  
  
  
  public List<Profile> filterByfName_or_lName(String fname, String lname)
  {
	  ArrayList<Profile> by_fname_lname=new ArrayList<Profile>();
	  for(Profile prof:profiles.values())
	  {
		  if(prof.getLatsName().equalsIgnoreCase(lname) || prof.getFirstName().equalsIgnoreCase(fname))
			  by_fname_lname.add(prof);
	  }
	  return by_fname_lname;
  }
  
  
  public List<Profile> filterByfName_and_lName(String fname, String lname)
  {
	  ArrayList<Profile> by_fname_and_lname=new ArrayList<Profile>();
	  for(Profile prof:profiles.values())
	  {
		  if(prof.getLatsName().equalsIgnoreCase(lname) && prof.getFirstName().equalsIgnoreCase(fname))
			  by_fname_and_lname.add(prof);
	  }
	  return by_fname_and_lname;
  }
  
  
  
  
  public List<Profile> filterByEverything(String address,String fname,String lname)
  {
	  ArrayList<Profile> listByeverything=new ArrayList<Profile>();
	  for(Profile prof:profiles.values())
	  {
		  if(prof.getAddress().equalsIgnoreCase(address) &&
				  prof.getFirstName().equalsIgnoreCase(fname) &&
				  prof.getLatsName().equalsIgnoreCase(lname))
			  listByeverything.add(prof);
	  }
	  return listByeverything;
  }
  
  
  
  
  
  public Profile getProfile(long id)
  {
	  return profiles.get(id);
  }
  
  
  public Profile addProfile(Profile profile)
  {
	  profile.setProfileId(profiles.size()+1);
	  profiles.put(profile.getProfileId(),profile);
	  return profile;
  }
  
  
  public Profile updateProfile(Profile profile)
  {
	  if(profile.getProfileId()<=0)
		  return null;
	  else
		     profiles.put(profile.getProfileId(),profile);
	  return profile;
  }
  
  
  public void deleteProfile(long deleteID)
  {
	  profiles.remove(deleteID);
	  System.out.println("profile deleted");
  }
  
}
