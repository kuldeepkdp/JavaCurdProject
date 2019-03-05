package com.kdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	
	@RequestMapping(value="/goToHome", method=RequestMethod.GET)
	public ModelAndView getLoginForm() {

		ModelAndView model = new ModelAndView("homePage");
		return model;
	}

	
	/*@RequestMapping(value="/product", method=RequestMethod.GET)
	public ModelAndView getProductForm() {

		ModelAndView model = new ModelAndView("productPage");
		return model;
	}
	
	@RequestMapping(value="/order", method=RequestMethod.GET)
	public ModelAndView getOrderForm() {

		ModelAndView model = new ModelAndView("orderPage");
		return model;
	}
	
	@RequestMapping(value="/sales", method=RequestMethod.GET)
	public ModelAndView getSalesForm() {

		ModelAndView model = new ModelAndView("salesPage");
		return model;
	}*/


}
