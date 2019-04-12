package org.Customers.example.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.Customers.example.beans.Customer;
import org.Customers.example.beans.Vendors;
import org.Customers.example.databse.CustomerDatabse;

public class CustomerResource
{
    //private Map<Integer,Customer> customers=CustomerDatabse.getCustomers();
	//private List<Customer> customers=CustomerDatabse.getCustomers();
   
	private static Set<Customer> customers=CustomerDatabse.getCustomers();
	private static Set<Vendors> vendors= CustomerDatabse.getVendors();
	 static{
		 Vendors v1=new Vendors(101,"abhi","bhubaneswar");
		 vendors.add(v1);
		 System.out.println("executing static block");
		 Customer c1=new Customer(1,"Harry","texas","Harry@gmail.com","26354328563",4655.15,vendors);
	      //Customer c2=new Customer(2,"Ram","New jersey","ram@gmail.com","324531352",4655.15,vendors);
	      customers.add(c1);
	      //customers.add(c2);
	}
	
   public CustomerResource()
   {
	   System.out.println("database constructor called");
	/*customers.put(1,new Customer(1,"Harry","texas","Harry@gmail.com","26354328563",4655.15));
	customers.put(2,new Customer(2,"Ryan","New Jersey","Ryan@gmail.com","6456895932",12564.78));
   */
	   
	   //for HashSet
	  /* Customer c1=new Customer(1,"Harry","texas","Harry@gmail.com","26354328563",4655.15);
	      Customer c2=new Customer(2,"Ram","New jersey","ram@gmail.com","324531352",4655.15);
	      customers.add(c1);
	      customers.add(c2);*/
   }
   public List<Customer> getAllCustomers()
   {
	   //return new ArrayList<>(customers.values());
	   return new ArrayList<>(customers);
   }
   
   public List<Customer> addCustomer(Customer customer)
   {
	   customer.setCust_id(customers.size()+1);
	   //customers.put(customer.getCust_id(),customer);
	   
	   customers.add(customer);
	   System.out.println("new customer added and updated list is : "+customers.size());
	   return new ArrayList<>(customers);
   }
   
   public Customer getCustomer(int id)
   {
	   for(Customer cust:customers)
	   {
		   if(cust.getCust_id()==id)
			   return cust;
	   }
	   return null;
   }
   
   
   
}
