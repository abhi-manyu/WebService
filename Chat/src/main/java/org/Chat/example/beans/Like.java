package org.Chat.example.beans;

import java.util.Date;

public class Like
{
   private int lkId;
   private String likerNm;
   private Date likedDt;
   public Like() {
	// TODO Auto-generated constructor stub
    }
public Like(int lkId, String likerNm) {
	super();
	this.lkId = lkId;
	this.likerNm = likerNm;
	this.likedDt=new Date();
}
public int getLkId() {
	return lkId;
}
public void setLkId(int lkId) {
	this.lkId = lkId;
}
public String getLikerNm() {
	return likerNm;
}
public void setLikerNm(String likerNm) {
	this.likerNm = likerNm;
}
public Date getLikedDt() {
	return likedDt;
}
public void setLikedDt(Date likedDt) {
	this.likedDt = likedDt;
}
   
}
