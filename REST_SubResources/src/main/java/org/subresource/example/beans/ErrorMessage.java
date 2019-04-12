package org.subresource.example.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage
{
   private String errorMessage;
   private int errorcode;
   private String helppage;
   public ErrorMessage() {
	// TODO Auto-generated constructor stub
    }
public ErrorMessage(String errorMessage, int errorcode, String helppage) {
	super();
	this.errorMessage = errorMessage;
	this.errorcode = errorcode;
	this.helppage = helppage;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public int getErrorcode() {
	return errorcode;
}
public void setErrorcode(int errorcode) {
	this.errorcode = errorcode;
}
public String getHelppage() {
	return helppage;
}
public void setHelppage(String helppage) {
	this.helppage = helppage;
}
   
}
