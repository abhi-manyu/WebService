package org.Customers.example.databse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.Customers.example.beans.Customer;
import org.Customers.example.beans.Vendors;

public class CustomerDatabse
{
    /*private static Map<Integer,Customer> customers=new HashMap<>();
    public static Map<Integer, Customer> getCustomers() {
		return customers;
	}*/
	
	
	/*private static List<Customer> customers=new ArrayList<>();
	
	public static List<Customer> getCustomers() {
		return customers;
	}*/
	
	
	private static Set<Customer> customers=new HashSet<>();
	private static Set<Vendors> vendors=new HashSet<>();
	
	public static Set<Customer> getCustomers() {
		return customers;
	}
	public static Set<Vendors> getVendors() {
		return vendors;
	}
}
