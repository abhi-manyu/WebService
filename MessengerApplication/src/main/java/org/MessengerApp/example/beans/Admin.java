package org.MessengerApp.example.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Admin
{
   @NotNull(message="can not be null")
   @NotEmpty(message="can not b empty")
   private String username;
   
   @NotEmpty(message="can not be empty")
   @NotNull(message="can not be null")
   @Size(min=5,max=10,message="password length should between 5-10 character")
   private String password;
   public Admin() {
	// TODO Auto-generated constructor stub
}
public Admin(String username, String password) {
	super();
	this.username = username;
	this.password = password;
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
