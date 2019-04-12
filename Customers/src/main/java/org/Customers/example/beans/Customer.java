package org.Customers.example.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Customer
{
    private int cust_id;
    private String cust_name;
    private String cust_adddress;
    private String cust_mail;
    private String cust_phone;
    private Date order_placing_date;
    private Date order_recvd_date;
    private Double order_amount;
    private Set<Vendors> vendors=new HashSet<>();
    public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cust_id, String cust_name, String cust_adddress, String cust_mail, String cust_phone,
			Double order_amount,Set<Vendors> vendors) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_adddress = cust_adddress;
		this.cust_mail = cust_mail;
		this.cust_phone = cust_phone;
		this.order_amount = order_amount;
		this.order_placing_date=new Date();
		this.order_recvd_date=new Date();
		this.vendors=vendors;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_adddress() {
		return cust_adddress;
	}
	public void setCust_adddress(String cust_adddress) {
		this.cust_adddress = cust_adddress;
	}
	public String getCust_mail() {
		return cust_mail;
	}
	public void setCust_mail(String cust_mail) {
		this.cust_mail = cust_mail;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public Date getOrder_placing_date() {
		return order_placing_date;
	}
	public void setOrder_placing_date(Date order_placing_date) {
		this.order_placing_date = order_placing_date;
	}
	public Date getOrder_recvd_date() {
		return order_recvd_date;
	}
	public void setOrder_recvd_date(Date order_recvd_date) {
		this.order_recvd_date = order_recvd_date;
	}
	public Double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(Double order_amount) {
		this.order_amount = order_amount;
	}
	
	public void setVendors(Set<Vendors> vendors) {
		this.vendors = vendors;
	}
	@XmlTransient
	public Set<Vendors> getVendors() {
		return vendors;
	}
    
}
