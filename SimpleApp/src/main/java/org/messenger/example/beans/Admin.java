package org.messenger.example.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Admin
{
	@NotNull
	@NotEmpty
      private String username;
	
	@NotNull
	@NotEmpty
	@Size(min=5,max=8,message="password length should be between 5 to 8 character")
      private String password;
	
	
      public Admin()
      {
	
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
