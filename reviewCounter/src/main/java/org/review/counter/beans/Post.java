package org.review.counter.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post {
   private int postID;
   private String post;
   private String poster_Name;
   private Date postingDate;
   public Post() {
	// TODO Auto-generated constructor stub
}
public Post(int postID, String poster_Name,String post, Date postingDate) {
	super();
	this.postID = postID;
	this.poster_Name = poster_Name;
	this.postingDate = postingDate;
	this.post=post;
}
public int getPostID() {
	return postID;
}
public void setPostID(int postID) {
	this.postID = postID;
}
public String getPoster_Name() {
	return poster_Name;
}
public void setPoster_Name(String poster_Name) {
	this.poster_Name = poster_Name;
}
public Date getPostingDate() {
	return postingDate;
}
public void setPostingDate(Date postingDate) {
	this.postingDate = postingDate;
}
   public void setPost(String post) {
	this.post = post;
}
   public String getPost() {
	return post;
}
  /* public String toString()
   {
	   return post;
   }*/
}
