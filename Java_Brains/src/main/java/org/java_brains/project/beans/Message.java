package org.java_brains.project.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement
public class Message
{
    private long messageID;
    private String message;
    private Date messageCretionDate;
    private String senderName;
    public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(long messageID, String message, String senderName) {
		super();
		this.messageID = messageID;
		this.message = message;
		this.senderName = senderName;
		this.messageCretionDate=new Date();
	}
	public long getMessageID() {
		return messageID;
	}
	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getMessageCretionDate() {
		return messageCretionDate;
	}
	public void setMessageCretionDate(Date messageCretionDate) {
		this.messageCretionDate = messageCretionDate;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
    
}
