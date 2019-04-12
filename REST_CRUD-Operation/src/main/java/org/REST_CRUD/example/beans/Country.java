package org.REST_CRUD.example.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country
{
    private int cID;
    private String cName;
    private String capital;
    private long population;
    public Country() {
		// TODO Auto-generated constructor stub
	}
	public Country(int cID, String cName, String capital, long population) {
		super();
		this.cID = cID;
		this.cName = cName;
		this.capital = capital;
		this.population = population;
	}
	
	@XmlElement(name="country_ID")
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	
	@XmlElement(name="country_Name")
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	@XmlElement(name="capital")
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	@XmlElement(name="population")
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
    
	public String toString()
	{
		return "name : "+cName+" capital : "+capital+"population : "+population;
	}
}
