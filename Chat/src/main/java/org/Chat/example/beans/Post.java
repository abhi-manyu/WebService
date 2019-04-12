package org.Chat.example.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post
{
   private int postId;
   private String post;
   private String posterName;
   private Date postingDate;
   private List<Comment> comments=new ArrayList<>();
   private List<Like> likes=new ArrayList<>();
   private List<Share> shares=new ArrayList<>();
   public Post() {
	// TODO Auto-generated constructor stub
      }
public Post(int postId, String post, String posterName)
  {
	super();
	this.postId = postId;
	this.post = post;
	this.posterName = posterName;
	this.postingDate= new Date();
	this.comments=new ArrayList<>();
	this.likes=new ArrayList<>();
	this.shares=new ArrayList<>();
  }
public int getPostId() {
	return postId;
}
public void setPostId(int postId) {
	this.postId = postId;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public String getPosterName() {
	return posterName;
}
public void setPosterName(String posterName) {
	this.posterName = posterName;
}
public Date getPostingDate() {
	return postingDate;
}
public void setPostingDate(Date postingDate) {
	this.postingDate = postingDate;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public List<Like> getLikes() {
	return likes;
}
public void setLikes(List<Like> likes) {
	this.likes = likes;
}
public List<Share> getShares() {
	return shares;
}
public void setShares(List<Share> shares) {
	this.shares = shares;
}
   
   
}
