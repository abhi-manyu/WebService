package org.Chat.example.beans;

import java.util.Date;

public class Share
{
   private int id;
   private String profNm;
   private Date sharedDt;
   
public Share() {
	// TODO Auto-generated constructor stub
     }
public Share(int id, String profNm)
{
	super();
	this.id = id;
	this.profNm = profNm;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProfNm() {
	return profNm;
}
public void setProfNm(String profNm) {
	this.profNm = profNm;
}
public Date getSharedDt() {
	return sharedDt;
}
public void setSharedDt(Date sharedDt) {
	this.sharedDt = sharedDt;
}


}
