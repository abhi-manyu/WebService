package org.RESTful_All_methods.example.beans;


public class Student
{
    private int rollNo;
	
    private String name;
	
    private double marks;
	
    private String address;
    
    public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, double marks, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
}
