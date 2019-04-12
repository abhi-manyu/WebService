package org.webservices_XML_response.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="customer")
public class Customer
{
    int custID;
    String custName;
    String custAddress;
    
    public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
    public void setCustID(int custID) {
		this.custID = custID;
	}
    public void setCustName(String custName) {
		this.custName = custName;
	}
    
    @XmlElement(name="CustomerID")
    public int getCustID() {
		return custID;
	}
    @XmlElement(name="customerElement")
    public String getCustName() {
		return custName;
	}
    @XmlElement(name="customerAddress")
    public String getCustAddress()
    {
		return custAddress;
	}
}
