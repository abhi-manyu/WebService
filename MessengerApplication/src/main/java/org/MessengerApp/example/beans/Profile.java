package org.MessengerApp.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="profileTable")
public class Profile
{
	@Id
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phonenumber;
    private Date createdDate;
    public Profile() {
		// TODO Auto-generated constructor stub
	}
	public Profile(int id, String firstName, String lastName, String address, String phonenumber)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phonenumber = phonenumber;
		this.createdDate=new Date();
	}
	@XmlElement(name="profileID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@XmlElement(name="phoneNumber")
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@XmlElement(name="profile-createdOn")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
    
}
