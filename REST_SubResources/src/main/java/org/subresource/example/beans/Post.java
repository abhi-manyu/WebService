package org.subresource.example.beans;

import java.util.Date;
import org.subresource.example.beans.JsonDateSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class Post
{
   private long postId;
   private String post;
   private Date creationdate;
   private String sendername;
   
   public Post() {
}
public Post(long postId, String post,String sendername) {
	super();
	this.postId = postId;
	this.post = post;
	this.sendername=sendername;
	this.creationdate=new Date();
}
public long getPostId() {
	return postId;
}
public void setPostId(long postId) {
	this.postId = postId;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}

@JsonSerialize(using=JsonDateSerializer.class)
  public Date getCreationdate() {
	return creationdate;
}
  public void setCreationdate(Date creationdate) {
	this.creationdate = creationdate;
}
  public String getSendername() {
	return sendername;
}
  public void setSendername(String sendername) {
	this.sendername = sendername;
}
}
