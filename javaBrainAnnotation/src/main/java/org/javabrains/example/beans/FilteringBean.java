package org.javabrains.example.beans;

import javax.ws.rs.QueryParam;

public class FilteringBean
{
    private @QueryParam("name")
    String name;
    
    private @QueryParam("uname")
    String unm;
    
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public void setUnm(String unm) {
		this.unm = unm;
	}
    public String getUnm() {
		return unm;
	}
}
