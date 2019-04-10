package org.Country_Capital_Example.example.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country_Capital
{
    private int countID;
    private String countName;
    private String count_Capital;
    
    public Country_Capital() {
		// TODO Auto-generated constructor stub
	}

	public Country_Capital(int countID, String countName, String count_Capital) {
		super();
		this.countID = countID;
		this.countName = countName;
		this.count_Capital = count_Capital;
	}

	@XmlElement(name="countryID")
	public int getCountID() {
		return countID;
	}

	public void setCountID(int countID) {
		this.countID = countID;
	}

	@XmlElement(name="country_Name")
	public String getCountName() {
		return countName;
	}

	public void setCountName(String countName) {
		this.countName = countName;
	}

	@XmlElement(name="Capital")
	public String getCount_Capital() {
		return count_Capital;
	}

	public void setCount_Capital(String count_Capital) {
		this.count_Capital = count_Capital;
	}
    
    
}
