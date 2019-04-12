package org.MessengerApp.example.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CollectionOfElements;

@XmlRootElement
@Entity
@Table(name="messageTable")
public class Message
{
	@Id
    private int messageID;
    private String messageContent;
    private String senderName;
    private Date createdDate;
    
    public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(int messageID, String messageContent, String senderName) {
		super();
		this.messageID = messageID;
		this.messageContent = messageContent;
		this.senderName = senderName;
		this.createdDate=new Date();
	}
    
	@XmlElement(name="messageID")
	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
    
	@XmlElement(name="messageContent")
	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
    
	@XmlElement(name="senderName")
	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@XmlElement(name="posted_on")
	public Date getCreatedDate() {
		return createdDate;
	}
    
    
}
