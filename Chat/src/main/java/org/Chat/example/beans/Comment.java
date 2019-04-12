package org.Chat.example.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Comment
{
   private int cmtId;
   private String cmt;
   private Date cmtDt;
   private String profileNm;
   public Comment() {
	// TODO Auto-generated constructor stub
    }
public Comment(int cmtId, String cmt, String profileNm) {
	super();
	this.cmtId = cmtId;
	this.cmt = cmt;
	this.profileNm = profileNm;
	this.cmtDt=new Date();
}
public int getCmtId() {
	return cmtId;
}
public void setCmtId(int cmtId) {
	this.cmtId = cmtId;
}
public String getCmt() {
	return cmt;
}
public void setCmt(String cmt) {
	this.cmt = cmt;
}
public Date getCmtDt() {
	return cmtDt;
}
public void setCmtDt(Date cmtDt) {
	this.cmtDt = cmtDt;
}
public String getProfileNm() {
	return profileNm;
}
public void setProfileNm(String profileNm) {
	this.profileNm = profileNm;
}
   
}
