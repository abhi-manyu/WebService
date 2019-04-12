package org.review.counter.controller;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.review.counter.Database.PostDatabase;
import org.review.counter.beans.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LikeController 
{
	PostDatabase pd;
	List<Post> li;
  @GetMapping("/all")
  public String getAllPosts(Model mod)
  {
	  String msg="";
	   pd=new PostDatabase();
	   li=pd.returnAllPosts();
	   Iterator<Post> itr=li.iterator();
	   while(itr.hasNext())
	   {
		   Post po=itr.next();
		   msg+=po.getPost()+"<hr>";
				   
	   }
	   mod.addAttribute("posts",msg);
	   return "allposts";
  }
  @GetMapping("/displayform")
  public String displayForm(Model mod)
  {
	  return "retriveform";
  }
  
  @PostMapping("/retrivePost")
  @Produces(MediaType.APPLICATION_XML)
  public Post retrivePost(@FormParam("retnum")Integer postID)
  {
	  pd=new PostDatabase();
	  li=pd.returnAllPosts();
	  System.out.println("retrived all posts : "+li);
	  Iterator<Post> itr2=li.iterator();
	  while(itr2.hasNext())
	  {
		  Post po=itr2.next();
		  if(po.getPostID()==postID)
			  return po;
	  }
	  return new Post();
  }
  
}
