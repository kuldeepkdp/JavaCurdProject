	package com.kdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kdp.dao.LoginImp;


@Controller
public class LoginController {
	
	
	@RequestMapping(value="/admin/login", method=RequestMethod.GET)
	public ModelAndView getLoginForm() {

		ModelAndView model = new ModelAndView("loginPage");
		return model;
	}
	
	@RequestMapping(value="/admin/loginNotAuthenticated", method=RequestMethod.GET)
	public ModelAndView doLogin() {

		ModelAndView model = new ModelAndView("loginPage");
		model.addObject("msg", "Invalid User");
		return model;
	}
	
	@RequestMapping(value="/admin/home", method=RequestMethod.POST)
	public ModelAndView getHomePage(@RequestParam("userId") String userId,@RequestParam("password") String password) {
          
		LoginImp login= new LoginImp();
		if (login.isValid(userId, password)== true){
		
		ModelAndView model = new ModelAndView("adminHomePage");
		model.addObject("msg", userId);
		return model;
		}
		
		else
		{
			return new ModelAndView("redirect:/admin/loginNotAuthenticated");
		}
	}
	
}
