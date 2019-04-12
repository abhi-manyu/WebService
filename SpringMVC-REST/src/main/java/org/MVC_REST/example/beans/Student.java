package org.MVC_REST.example.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student
{
   private int rollno;
   private String name;
   private String address;
   private String phno;
   private String username;
   private String password;
   public Student() {
	// TODO Auto-generated constructor stub
  }
public Student(int rollno, String name, String address, String phno, String username, String password) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
	this.phno = phno;
	this.username = username;
	this.password = password;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}
