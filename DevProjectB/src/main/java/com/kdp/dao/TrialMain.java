package com.kdp.dao;

import com.kdp.model.Customers;

public class TrialMain {

	public static void main(String[] args) {
		
		
		CustomerImp cust= new CustomerImp();
	    Customers c= cust.getCustomer(1111);
	    
		System.out.println("customer name is" + c.getCustomerName());
		
			
	  

	}

}
