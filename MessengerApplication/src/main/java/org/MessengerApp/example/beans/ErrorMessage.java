package org.MessengerApp.example.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
 
	private int error_Code;
	private String desc;
	private String help;
	
	public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(int error_Code, String desc, String help) {
		super();
		this.error_Code = error_Code;
		this.desc = desc;
		this.help = help;
	}

	public int getError_Code() {
		return error_Code;
	}

	public void setError_Code(int error_Code) {
		this.error_Code = error_Code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}
	
}
