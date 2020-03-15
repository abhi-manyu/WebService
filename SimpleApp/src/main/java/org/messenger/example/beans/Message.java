package org.messenger.example.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
      private int msgId;
      private String message;
      private Date rcveddate;
      private String senderName;
      public Message() {
	}
	public Message(int msgId, String message, String senderName) {
		super();
		this.msgId = msgId;
		this.message = message;
		this.senderName = senderName;
		this.rcveddate=new Date();
	}
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getRcveddate() {
		return rcveddate;
	}
	public void setRcveddate(Date rcveddate) {
		this.rcveddate = rcveddate;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
      
}
