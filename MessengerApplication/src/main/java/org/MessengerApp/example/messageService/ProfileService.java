package org.MessengerApp.example.messageService;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.MessengerApp.example.beans.Message;
import org.MessengerApp.example.beans.Profile;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

@Path("/profiles")
public class ProfileService
{
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	SessionFactory sf;
	Session s;
	
	@Path("/add")
    @Produces("text/html")
    @POST
    public Response addMessenger(@FormParam("pID")int pid,
    		@FormParam("fnm") String FNM, @FormParam("lnm")String LNM,
    		@FormParam("phno")String phno,@FormParam("addre")String address)
    {
    	cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Profile pf=new Profile(pid, FNM,LNM, address,phno);
    	s.save(pf);
    	t.commit();
    	String output="<html><body>"
    			+ "<h2 style='color:green'>u r registered , u can post ny msg on ur wall</h2>"
    			+ "</body></html>";
    	s.close();
    	sf.close();
    	return Response.status(200).entity(output).build();
    }
	
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public List<Profile> getAllMessengers()
	{
		cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Profile.class);
    	List<Profile> list=cr.list();
    	s.close();
    	sf.close();
    	return list;
	}
	@Path("/get")
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public Profile getSingleProfile(@FormParam("proid")int profid)
	{
		cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Profile.class);
    	Criterion c=Restrictions.eq("id", profid);
    	cr.add(c);
    	Profile pr=(Profile) cr.uniqueResult();
    	return pr;
	}
	
	
	@Path("/delete")
	@Produces(MediaType.TEXT_HTML)
	@POST
	public String deleteMessage(@FormParam("delproid")int id)
    {
    	cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
		sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria cr=s.createCriteria(Profile.class);
    	Criterion c=Restrictions.eq("id",id);
    	cr.add(c);
    	Profile prf=(Profile) cr.uniqueResult();
    	s.delete(prf);
    	t.commit();
    	s.close();
    	sf.close();
    	return "<html><body>"
    			+ "<h2>bellow ur profile details : </h2>"
    			+ "ur profile id : "+prf.getId()+"<br>"
    			+ "ur first name : "+prf.getFirstName()+"<br>"
    			+ "ur last name : "+prf.getLastName()+"<br>"
    			+ "ur contact number : "+prf.getPhonenumber()+"<br>"
    			+ "ur contact address : "+prf.getAddress()+"<br>"
    			+ "ur profile had been created on : "+prf.getCreatedDate()+"<br>"
    			+ "<h2><span style='color:red ;'>deleted</span> successfully</h2>"
    			+ "</body></html>";
    }
}
