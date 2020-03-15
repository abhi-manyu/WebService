package org.RESTful.example.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.RESTful.example.beans.Student;

@Path("/example1")
public class RESTfulExample1
{
    @Path("/getdata")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Student getdata()
    {
    	Student st=new Student(135,"abhimanyu",56.89,"bhadrak");
    	return st;
    }
}
