package org.RESTful.example.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student
{
   private int studentID;
   private String studentName;
   private double studentMark;
   private String studentAddress;
   
   public Student() {
	// TODO Auto-generated constructor stub
   }

public Student(int studentID, String studentName, double studentMark, String studentAddress) {
	super();
	this.studentID = studentID;
	this.studentName = studentName;
	this.studentMark = studentMark;
	this.studentAddress = studentAddress;
   }
@XmlElement(name="studentID")
public int getStudentID() {
	return studentID;
}

public void setStudentID(int studentID) {
	this.studentID = studentID;
}

@XmlElement(name="studentName")
public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

@XmlElement(name="studentMarks")
public double getStudentMark() {
	return studentMark;
}

public void setStudentMark(double studentMark) {
	this.studentMark = studentMark;
}

@XmlElement(name="studentAddress")
public String getStudentAddress() {
	return studentAddress;
}

public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
   
}
