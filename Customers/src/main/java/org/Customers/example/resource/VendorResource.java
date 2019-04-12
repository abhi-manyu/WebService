package org.Customers.example.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.Customers.example.beans.Customer;
import org.Customers.example.beans.Vendors;
import org.Customers.example.databse.CustomerDatabse;

public class VendorResource
{
    private Set<Customer> cust_list=CustomerDatabse.getCustomers();
    
    
    
    public List<Vendors> getAllVendors(int id)
    {
    	for(Customer customer:cust_list)
    	{
    		if(customer.getCust_id()==id)
    			return new ArrayList<>(customer.getVendors());
    	}
    	return new ArrayList<>();
    }
    
    
    public Vendors getVendor(int cust_id,int ven_id)
    {
    	for(Customer customer:cust_list)
    	{
    		if(customer.getCust_id()==cust_id)
    		{
    			Set<Vendors> vendors=customer.getVendors();
    			for(Vendors vendor:vendors)
    			{
    				if(vendor.getId()==ven_id)
    					return vendor;
    			}
    		}
    	}
    	return null;
    }
    
    
    public List<Vendors> addVendors(int id ,Vendors vendor)
    {
    	for(Customer customer:cust_list)
    	{
    		if(customer.getCust_id()==id)
    		{
    			Set<Vendors> vendors=customer.getVendors();
    			vendor.setId(vendors.size()+1);
    			vendors.add(vendor);
    			System.out.println("vendors added successfully");
    			return new ArrayList<>(vendors);
    		}
    	}
    	System.out.println("couldn't add vendors");
    	return new ArrayList<>();
    }
    
    
    
    
}
