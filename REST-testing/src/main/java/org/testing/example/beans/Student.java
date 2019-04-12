package org.testing.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="studentTable")
public class Student
{
	@Id
   private int id;
   private String name;
   private String address;
   private String marks;
   private String phonenomber;
   public Student() {
	// TODO Auto-generated constructor stub
   }
public Student(int id, String name, String address, String marks, String phonenomber)
   {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.marks = marks;
	this.phonenomber = phonenomber;
    }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public String getPhonenomber() {
	return phonenomber;
}
public void setPhonenomber(String phonenomber) {
	this.phonenomber = phonenomber;
}
   
}
