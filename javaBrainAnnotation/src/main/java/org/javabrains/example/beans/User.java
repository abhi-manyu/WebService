package org.javabrains.example.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
public class User
{
   private long id;
   private String name;
   private String mail;
   private String address;
   private Date creationDate;
   private String UserName;
   private String password;
   public User() {
	// TODO Auto-generated constructor stub
}
public User(long id, String name, String mail, String userName, String password,
		          String address) {
	super();
	this.id = id;
	this.name = name;
	this.mail = mail;
	this.address=address;
	UserName = userName;
	this.password = password;
	this.creationDate=new Date();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress() {
	return address;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}
