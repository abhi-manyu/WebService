package org.testing.example.services;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.testing.example.beans.Student;

@Path("/students")
public class StudentServices
{
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	SessionFactory sf;
	Session s;
	
	
    @Path("/all")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public List<Student> getAllStudents()
    {
    	cfg.configure("org/testing/example/resources/student.cfg.xml");
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Student.class);
    	List<Student> li=cr.list();
    	return li;
    }
    
    @Path("/single")
    @Produces("text/html")
    @POST
    public Response getSingleStudent(@FormParam("retID")int ID)
    {
    	cfg.configure("org/testing/example/resources/student.cfg.xml");
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Student.class);
    	Criterion c=Restrictions.eq("id", ID);
    	cr.add(c);
    	Object obj=cr.uniqueResult();
    	if(obj!=null)
    	{
    	   Student st =(Student) cr.uniqueResult();
    	   String output="<html><body>"
    	   		+ "<h2>Student data retrived successfully</h2><hr>"
    	   		+ "ID : "+st.getId()+" <br>"
    	   		+ "Name : "+st.getName()+" <br>"
    	   		+ "Phone number : "+st.getPhonenomber()+" <br>"
    	   		+ "Marks : "+st.getMarks()+" <br>"
    	   		+ "Address : "+st.getAddress()+" <br>"
    	   		+ "</body></html>";
    	   return Response.status(200).entity(output).build();
    	}
    	else
    	{
    		String output="<html><body>"
    				+ "<h2 style='color:red'>No data found associated with this ID</h2>"
    				+ "</body></html>";
    		return Response.status(200).entity(output).build();
    	}
    }
    
      @Path("/add")
      @Produces(MediaType.APPLICATION_XML)
      @POST
      public Student addStudentData(@FormParam("rol")int rolno,
    		  @FormParam("nm")String name,@FormParam("address")String addr,
    		  @FormParam("mark")String marks,@FormParam("phno")String phone)
      {
    	  cfg.configure("org/testing/example/resources/student.cfg.xml");
    	  sf=cfg.buildSessionFactory();
    	  s=sf.openSession();
    	  Transaction t=s.beginTransaction();
    	  Student st=new Student(rolno, name, addr, marks, phone);
    	  s.save(st);
    	  t.commit();
    	  s.close();
    	  return st;
      }
      
      @Path("/delete")
      @Produces("text/html")
      @POST
      public Response deleteStudent(@FormParam("delID")int ID)
      {
    	  cfg.configure("org/testing/example/resources/student.cfg.xml");
    	  sf=cfg.buildSessionFactory();
    	  s=sf.openSession();
    	  Transaction t=s.beginTransaction();
    	  try
    	  {
    	    Student st= (Student) s.get(Student.class, ID);
    	    s.delete(st);
    	    t.commit();
    	    String output="<html><body>"
    	    		+ "<h2 style='color:green'>record deleted successfully</h2>"
    	    		+ "</body></html>";
    	    return Response.status(200).entity(output).build();
    	  }
    	  catch (Exception e)
    	  {
			String output="<html><body>"
    	    		+ "<h2 style='color:red'>record not found</h2>"
    	    		+ "</body></html>";
			return Response.status(200).entity(output).build();
		  }
      }
}
