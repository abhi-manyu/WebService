package org.SubResource.example.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
public class Comment
{
   private int commentId;
   private String comment;
   private String comenterName;
   private Date comentedDate;
   public Comment() {
	
}
   
   
public Comment(int commentId, String comment, String comenterName)
{
	super();
	this.commentId = commentId;
	this.comment = comment;
	this.comenterName = comenterName;
	this.comentedDate=new Date();
}


public int getCommentId() {
	return commentId;
}
public void setCommentId(int commentId) {
	this.commentId = commentId;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getComenterName() {
	return comenterName;
}
public void setComenterName(String comenterName) {
	this.comenterName = comenterName;
}
@JsonSerialize(using=JsonDateSerializer.class)
public Date getComentedDate() {
	return comentedDate;
}
public void setComentedDate(Date comentedDate) {
	this.comentedDate = comentedDate;
}
   
}
