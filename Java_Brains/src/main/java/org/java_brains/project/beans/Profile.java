package org.java_brains.project.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
public class Profile
{
   private long profileId;
   private String firstName;
   private String latsName;
   private String address;
   private Date profileCreationDate;
   
   public Profile() {

   }

public Profile(long profileId, String firstName, String latsName, String address) {
	super();
	this.profileId = profileId;
	this.firstName = firstName;
	this.latsName = latsName;
	this.address = address;
	this.profileCreationDate=new Date();
}

public long getProfileId() {
	return profileId;
}

public void setProfileId(long profileId) {
	this.profileId = profileId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLatsName() {
	return latsName;
}

public void setLatsName(String latsName) {
	this.latsName = latsName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getProfileCreationDate() {
	return profileCreationDate;
}

public void setProfileCreationDate(Date profileCreationDate) {
	this.profileCreationDate = profileCreationDate;
}
   
}
