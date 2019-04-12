package org.REST_CRUD.example.BundleClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

import org.REST_CRUD.example.beans.Country;

public class CountryBundle
{
	    static List<Country> li;
	    Scanner scn=new Scanner(System.in);
	    static List<Country> temp;
    	static
    	{
    		temp=new ArrayList<Country>();
        	Country c1=new Country(1,"India","Delhi",452000000000l);
        	Country c2=new Country(2,"Nepal","KathMandu",18000000l);
        	Country c3=new Country(3,"ThaiLand","BangKok",48900000l);
        	temp.add(c1);
        	temp.add(c2);
        	temp.add(c3);
    	}
    	
    	public List<Country> getAllCountryList()
    	{
    		li=temp;
    		return li;
    	}
    	
    	public List<Country> addToList()
    	{
    		System.out.println("enter the country id ");
    		int id=Integer.parseInt(scn.nextLine());
    		System.out.println("enter the country name");
    		String name=scn.nextLine();
    		System.out.println("enter the capital");
    		String capital=scn.nextLine();
    		System.out.println("enter the population");
    		long popu=scn.nextLong();
    		Country con=new Country(id, name, capital, popu);
    		temp.add(con);
    		li=temp;
    		System.out.println("the List is updated");
    		return li;
    	}
    	
    	
    	public Map<String,List<Country>> deleteFromList() throws InterruptedException
    	{
    		System.out.println("enter the name u want to delete");
    		String name=scn.nextLine();
    		ListIterator<Country> itr=li.listIterator();
    		while(itr.hasNext())
    		{
    		    Country co=itr.next();
    			if(co.getcName().equalsIgnoreCase(name))
    			{
    				itr.remove();
    			}
    		}
    		System.out.println("the updated list is bellow : \n ");
    		Map<String,List<Country>> m=new HashMap<String, List<Country>>();
    		m.put("success", li);
    		System.out.println("deleted successfully \n getting current list");
    		Thread.sleep(6000);
    		return m;
    		
    	}
    	
    	public Country updateData()
    	{
    		System.out.println("enter the country id u want to update");
    		int cID=Integer.parseInt(scn.nextLine());
    		ListIterator<Country> itr2=li.listIterator();
    		while(itr2.hasNext())
    		{
    			Country con=itr2.next();
    			if(con.getcID()==cID)
    			{
    				System.out.println("enter the new ID for this country");
    				int nID=Integer.parseInt(scn.nextLine());
    				System.out.println("enter the new name of this country");
    				String nName=scn.nextLine();
    				System.out.println("ente rthe new capital of this country");
    				String nCap=scn.nextLine();
    				System.out.println("enter the new population of the country");
    				long nPopu=scn.nextLong();
    				con.setcID(nID);
    				con.setcName(nName);
    				con.setCapital(nCap);
    				con.setPopulation(nPopu);
    				System.out.println(con);
    				System.out.println("the list has been updated");
    				return con;
    			}
    		}
    		return null;
    	}
    	
    	
}
