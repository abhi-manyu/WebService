package org.Posts.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Post
{
	@Id
   private int post_id;
   private String post;
   private String poster;
   public Post() {
	// TODO Auto-generated constructor stub
}
public Post(int post_id, String post, String poster) {
	super();
	this.post_id = post_id;
	this.post = post;
	this.poster = poster;
}
public int getPost_id() {
	return post_id;
}
public void setPost_id(int post_id) {
	this.post_id = post_id;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public String getPoster() {
	return poster;
}
public void setPoster(String poster) {
	this.poster = poster;
}
   
}
