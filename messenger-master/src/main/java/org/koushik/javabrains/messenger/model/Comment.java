package org.koushik.javabrains.messenger.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Comment {
	

	private long id;
    private String message;
    private Date created;
    private String author;
    
    public Comment() {
    	
    }
    
    public Comment(long id, String message, String author) {
    	this.id = id;
    	this.message = message;
    	this.author = author;
    	this.created = new Date();
    }
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCreated() {
		return created;
	}
	@JsonDeserialize(using=JsonDateDeserializer.class)
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
    

}
