package org.student.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.student.example.beans.Student;
import org.student.example.resources.StudentResource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//@Path("/students")
@RestController
public class StudentController
{
	StudentResource sr=new StudentResource();
	
   @RequestMapping(value="/students", method=RequestMethod.GET,
		   headers="Accept=application/xml")
   public List<Student> getAllStudents()
   {
	   System.out.println("first method is called");
	  List<Student> students= sr.getAllStudents();
	  return students;
   }
	
   /*@RequestMapping(value="/add",method=RequestMethod.GET,
		   consumes="application/xml")
	public List<Student> addStudent()
	{
		return sr.addStudent(Student student);
	}*/
	
	
}
