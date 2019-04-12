package org.SubResource.example.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@XmlRootElement
public class Message
{
   private int id;
   private String msg;
   private String senderName;
   private Date postingDate;
   private Map<Integer,Comment> comments=new HashMap<Integer, Comment>();
   
   public Message() {
	// TODO Auto-generated constructor stub
}

public Message(int id, String msg, String senderName) {
	super();
	this.id = id;
	this.msg = msg;
	this.senderName = senderName;
	this.postingDate=new Date();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public String getSenderName() {
	return senderName;
}

public void setSenderName(String senderName) {
	this.senderName = senderName;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getPostingDate() {
	return postingDate;
}

public void setPostingDate(Date postingDate) {
	this.postingDate = postingDate;
}
   public void setComments(Map<Integer, Comment> comments) {
	this.comments = comments;
}
   
   @XmlTransient
   public Map<Integer, Comment> getComments() {
	return comments;
}
   
}
