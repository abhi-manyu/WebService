package org.Chat.example.resource;

import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonbPropertyOrder({"errorCode","errorMessage","documentation"})
public class ErrorMessage
{
	 private int errCode;
     private String errorMessage;
     private String documentation;
     public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}
	public ErrorMessage(String errorMessage, int errCode, String documentation) {
		super();
		this.errorMessage = errorMessage;
		this.errCode = errCode;
		this.documentation = documentation;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrCode() {
		return errCode;
	}
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
     
}
