package org.SubResource.example.beans;

import javax.ws.rs.QueryParam;

public class FilterBean
{
    private @QueryParam("sender")String sendernm;
    
    public void setSendernm(String sendernm) {
		this.sendernm = sendernm;
	}
    public String getSendernm() {
		return sendernm;
	}
}
