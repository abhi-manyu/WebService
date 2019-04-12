package org.student.example.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.student.example.beans.Student;

@Path("/students")
public class StudentService
{
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Student> showlist()
    {
    	List<Student> li=returnlist();
    	return li;
    }
    
    
    
    public List<Student> returnlist()
    {
    	List<Student> li=new ArrayList<Student>();
    	Student st1=new Student(121,"king","Bhubaneswar");
    	Student st2=new Student(454,"Queen","Hydrabad");
    	Student st3=new Student(789,"prince","bangalore");
    	
    	li.add(st1);
    	li.add(st2);
    	li.add(st3);
    	
    	return li;
    }
}
