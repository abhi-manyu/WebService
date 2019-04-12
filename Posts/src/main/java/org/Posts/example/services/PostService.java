package org.Posts.example.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Posts.example.beans.Post;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@Path("/posts")
public class PostService
{
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Post> getAllPosts()
	{
		cfg.configure("org/Posts/example/xmls/post.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session  = sf.openSession();
		Transaction t=session.beginTransaction();
		
		Post p1=new Post(101,"first post","abhimanyu");
		Post p2=new Post(202,"second post","arabinda");
		//session.save(p1);
		//session.save(p2);
		System.out.println("data saved");
		t.commit();
		String data = "from Post";
		Query query = session.createQuery(data);
		List<Post> posts = query.list();
		
		//Criteria cr=session.createCriteria(Post.class);
		//List<Post> posts=new ArrayList<>();
		//posts=cr.list();
		return posts;
	}
	
}
