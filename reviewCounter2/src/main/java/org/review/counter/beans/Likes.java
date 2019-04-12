package org.review.counter.beans;

import java.util.Date;

public class Likes
{
   private int counter;
   private String likerName;
   private Date likeTime;
   public Likes() {
	// TODO Auto-generated constructor stub
}
public Likes(int counter, String likerName, Date likeTime) {
	super();
	this.counter = counter;
	this.likerName = likerName;
	this.likeTime = likeTime;
}
public int getCounter() {
	return counter;
}
public void setCounter(int counter) {
	this.counter = counter;
}
public String getLikerName() {
	return likerName;
}
public void setLikerName(String likerName) {
	this.likerName = likerName;
}
public Date getLikeTime() {
	return likeTime;
}
public void setLikeTime(Date likeTime) {
	this.likeTime = likeTime;
}
   
}
