package org.MVC_REST.example.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.MVC_REST.example.beans.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/students")
public class StudentService
{
   @GET
   @Produces(MediaType.APPLICATION_XML)
   public List<Student> showStudentList()
   {
	   List<Student> li=createlist();
	   System.out.println("method called");
	   return li;
   }
   
   
   
   
   public List<Student> createlist()
   {
	   List<Student> li=new ArrayList<Student>();
	   Student s1=new Student(121,"ABC","bangalore","123546","abc@gmail.com","abc21");
	   Student s2=new Student(456,"DEF","bhubaneswar","1973285","def@gmail.com","def89");
	   Student s3=new Student(852,"XYZ","Hydrabad","8524567","xyz@gmail.com","xyz78");
	   li.add(s1);
	   li.add(s2);
	   li.add(s3);
	   return li;
   }
}
