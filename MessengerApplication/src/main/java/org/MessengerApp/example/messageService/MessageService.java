package org.MessengerApp.example.messageService;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.MessengerApp.example.beans.ErrorMessage;
import org.MessengerApp.example.beans.Message;
import org.MessengerApp.example.beans.Profile;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


@Path("/messages")
public class MessageService
{
	private static int messageID;
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	SessionFactory sf;
	Session s;
	
	@Path("/add")
    @Produces("text/html")
    @POST
    public Response add_a_Message(@FormParam("mID")int mid,
    		@FormParam("msg") String msg, @FormParam("nam")String name)
    {
		
    	cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
    	sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	
    	
    	Criteria cr=s.createCriteria(Profile.class);
    	Projection p=Projections.property("firstName");
    	cr.setProjection(p);
        List<String> li=cr.list();
    	for(String temp:li)
    	{
    		if(temp.equals(name))
    		{
    			Transaction t=s.beginTransaction();
    	    	Message mes=new Message(mid, msg, name);
    	    	s.save(mes);
    	    	t.commit();
    	    	String output="<html><body>"
    	    			+ "<h2 style='color:green'>ur messages has succesfully been posted to ur wall</h2>"
    	    			+ "</body></html>";
    	    	s.close();
    	    	sf.close();
    	    	return Response.status(200).entity(output).build();
    		}
    	}
        
    	String reply="<html><body>"
    			+ "<h2>Message posting failed</h2><hr>"
    			+ ""
    			+ "<mark>reason</mark> : <span style='color:red'>"
    			+ "u r not a registered messenger, "
    			+ "so first register urself as a messenger or change the name</span>"
    			+"</body></html>";
    	return Response.status(200).entity(reply).build();
    }
	
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public List<Message> getAllMessages()
	{
		cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
		sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Message.class);
    	List<Message> li= cr.list();
    	if(li.size()<=0)
    	{
    		ErrorMessage ermsg = 
    		  new ErrorMessage(204,
    				  "No message instance found","http://www.google.com");
    		Response resp=Response.status(Status.NOT_FOUND).entity(ermsg).build();
    		throw new WebApplicationException(resp);
    	}
    	s.close();
    	sf.close();
    	return li;
	}
	
    @Path("/get")
    @Produces({MediaType.TEXT_HTML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @POST
    public String getSinglemessage(@FormParam("getms")int msgID)
    {
    	cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
		sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Criteria cr=s.createCriteria(Message.class);
    	Criterion c=Restrictions.eq("messageID",msgID);
    	cr.add(c);
    	Message msg=(Message) cr.uniqueResult();
    	if(msg==null)
    	{
    		ErrorMessage ermsg = 
    		  new ErrorMessage(404,
    				  "requested message resource not found","http://www.google.com");
    		Response resp=Response.status(Status.NOT_FOUND).entity(ermsg).build();
    		throw new WebApplicationException(resp);
    	}
    	
    	String output="<html><body><form action='./delete'>"
    			+"<h2>the message is : </h2><hr>"
    	        +"message id : "+msg.getMessageID()+"<br>"
    	        +"message content : "+msg.getMessageContent()+"<br>"
    	        +"message Sender Name : "+msg.getSenderName()+"<br>"
    	        +"message creation Date and time : "+msg.getCreatedDate()+"<br>"
    	        +"<input type='submit' value='delete' />"
    			+"</form></body></html>";
    	messageID=msg.getMessageID();
    	s.close();
    	sf.close();
    	return output;
    }
    
    @Path("/delete")
    @Produces(MediaType.TEXT_HTML)
    @POST
    public String deleteMessage(@FormParam("delID")int id)
    {
    	cfg.configure("org/MessengerApp/example/resources/messages.cfg.xml");
		sf=cfg.buildSessionFactory();
    	s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria cr=s.createCriteria(Message.class);
    	Criterion c=Restrictions.eq("messageID",id);
    	cr.add(c);
    	Message msg=(Message) cr.uniqueResult();
    	s.delete(msg);
    	t.commit();
    	s.close();
    	sf.close();
    	return "<html><body>"
    			+"<h2>the message of  </h2><hr>"
    	        +"id : "+msg.getMessageID()+"<br>"
    	        +"content : "+msg.getMessageContent()+"<br>"
    	        +"Sender Name : "+msg.getSenderName()+"<br>"
    	        +"creation Date : "+msg.getCreatedDate()+"<br>"
    	        +"<h2><span style='color:red'>deleted </span>successfully</h2>"
    			+ "</body></html>";
    }
}
