package com.kdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kdp.dao.CustomerImp;
import com.kdp.model.Customers;



@Controller
public class CustomerController {

	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public ModelAndView getCustomerList(@ModelAttribute("customer") Customers customers, 
			   BindingResult result) {
		
		CustomerImp cust= new CustomerImp();
		List<Customers> custList= cust.getCustomerDetails();
		ModelAndView model = new ModelAndView("customerPage");
		model.addObject("msg", custList);
		return model;
	}
	
	@RequestMapping(value="/customerAdd", method=RequestMethod.GET)
	public ModelAndView addCustomer() {
		
		ModelAndView model = new ModelAndView("customerAddPage");
		
		return model;
	}
	

	@RequestMapping(value = "/customerSuccess", method = RequestMethod.POST)
	public ModelAndView getCustomerSuccessPage(@ModelAttribute("abc") Customers customers, BindingResult result) {
		
		CustomerImp cust= new CustomerImp();
		cust.saveCustomerDetails(customers);
		
		ModelAndView model = new ModelAndView("customerSuccessPage");
		model.addObject("msg", "New Customer " +customers.getCustomerName()+" is added successfully");
		
		return model;
	}
	

	 @RequestMapping(value="/deleteCustomer/{customerID}",method = RequestMethod.GET)  
	    public ModelAndView deleteCustomer(@PathVariable("customerID") int ID){  
		    CustomerImp cust= new CustomerImp();
			cust.deleteCustomer(ID);
			return new ModelAndView("redirect:/customer");  
	    } 
	 
	 @RequestMapping(value="/editCustomer/{customerID}",method = RequestMethod.GET)  
	    public ModelAndView editCustomer(@PathVariable("customerID") int ID){  
		    CustomerImp cust= new CustomerImp();
		    Customers c= cust.getCustomer(ID);
			ModelAndView model = new ModelAndView("customerEditPage");
			model.addObject("msg", c);
			return model;
			
	    } 
	 
	 @RequestMapping(value = "/customerEditSave", method = RequestMethod.POST)
		public ModelAndView editCustomerSave(@ModelAttribute("abc") Customers customers, BindingResult result) {
			
			CustomerImp cust= new CustomerImp();
			cust.updateCustomer(customers);
			
			return new ModelAndView("redirect:/customer");
		}
	
}
