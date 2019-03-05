package com.kdp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kdp.dao.CustomerImp;
import com.kdp.dao.RiderImp;
import com.kdp.dao.RouteAndFareImp;
import com.kdp.model.Customers;
import com.kdp.model.Riders;
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
	@RequestMapping(value="admin/viewBooking", method=RequestMethod.GET)
	public ModelAndView getRidersList(@ModelAttribute("riders") Riders riders, 
			   BindingResult result) {
		
		RiderImp cab= new RiderImp();
		List<Riders> cabList= cab.getRidersDetails();
		ModelAndView model = new ModelAndView("viewBooking");
		model.addObject("msg", cabList);
		return model;
	
			
			
		}
	
	
	 @RequestMapping(value="admin/deleteRider/{phoneNo}",method = RequestMethod.GET)  
	    public ModelAndView deleteRiders(@PathVariable("phoneNo") int phoneNo){  
		    RiderImp cab= new RiderImp();
		    cab.deleteRider(phoneNo);
			return new ModelAndView("redirect:/admin/viewBooking");  
	    } 
	 
	 @RequestMapping(value="admin/editRider/{phoneNo}",method = RequestMethod.GET)  
	    public ModelAndView editRiders(@PathVariable("phoneNo") String phoneNo){  
		 RiderImp cab= new RiderImp();
		    Riders c= cab.getRider(phoneNo);
			ModelAndView model = new ModelAndView("riderEditPage");
			model.addObject("msg", c);
			return model;
			

			
			
	} 
	 
	 @RequestMapping(value = "/riderEditSave", method = RequestMethod.POST)
		public ModelAndView editRiderSave(@ModelAttribute("abc") Riders riders, BindingResult result) {
			
			RiderImp cab= new RiderImp();
			cab.updateRider(riders);
			
			return new ModelAndView("redirect:/admin/viewBooking");
		}
	 
	 
	 @RequestMapping(value="admin/viewRouteAndFare", method=RequestMethod.GET)
		public ModelAndView getRouteAndFareList(@ModelAttribute("routeAndFare") RouteAndFare routeAndFare, 
				   BindingResult result) {
			
		 RouteAndFareImp route= new RouteAndFareImp();
			List<RouteAndFare> routeList= route.getRouteAndFareDetails();
			ModelAndView model = new ModelAndView("viewRouteAndFare");
			model.addObject("msg", routeList);
			return model;
			
			
}
	 @RequestMapping(value="admin/deleteRouteAndFare/{routeAndFareID}",method = RequestMethod.GET)  
	    public ModelAndView RouteAndFare(@PathVariable("routeAndFareID") int routeAndFareID){  
		 RouteAndFareImp cab= new RouteAndFareImp();
		    cab.deleteRouteAndFare(routeAndFareID);
			return new ModelAndView("redirect:/admin/viewRouteAndFare");  
	    } 
	 
	 
	 @RequestMapping(value="admin/editRouteAndFare/{routeAndFareID}",method = RequestMethod.GET)  
	    public ModelAndView editRiders(@PathVariable("routeAndFareID") int routeAndFareID){  
		 RouteAndFareImp cab= new RouteAndFareImp();
		 RouteAndFare c= cab.getRouteAndFare(routeAndFareID);
			ModelAndView model = new ModelAndView("routeAndFareEditPage");
			model.addObject("msg", c);
			return model;
			

			
			
	} 
	 
	 @RequestMapping(value = "/routeAndFareEditSave", method = RequestMethod.POST)
		public ModelAndView editRouteAndFareSave(@ModelAttribute("abc") RouteAndFare routeAndFare, BindingResult result) {
			
		 RouteAndFareImp cab= new RouteAndFareImp();
			cab.updateRouteAndFare(routeAndFare);
			
			return new ModelAndView("redirect:/admin/viewRouteAndFare");
		}
}


