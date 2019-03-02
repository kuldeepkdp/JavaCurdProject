package com.kdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdp.dao.CustomerImp;
import com.kdp.dao.RouteAndFareImp;
import com.kdp.model.Customers;
import com.kdp.model.RouteAndFare;

@Controller
public class AdminController {
	
	@RequestMapping(value="/admin/routeAndFareAdd", method=RequestMethod.GET)
	public ModelAndView addCustomer() {
		
		ModelAndView model = new ModelAndView("routeAndFareAddPage");
		
		return model;
	}
	
	@RequestMapping(value = "/admin/routeAndFareSuccess", method = RequestMethod.POST)
	public ModelAndView getCustomerSuccessPage(@ModelAttribute("route") RouteAndFare routeAndFare, BindingResult result) {
		
		RouteAndFareImp route= new RouteAndFareImp();
		route.saveRouteAndFare(routeAndFare);
		ModelAndView model = new ModelAndView("customerSuccessPage");
		return model;
	}

}
