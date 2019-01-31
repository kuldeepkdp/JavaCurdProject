package com.kdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kdp.dao.Student;

@Controller
public class StudentAdmissionController {
	
		@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
		public ModelAndView getAdmissionForm() {

			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
		public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("formNo") int num) {
			
			Student.saveStudentInfo2(name, num);

			ModelAndView model = new ModelAndView("AdmissionSuccess");
			model.addObject("msg", "Name: " +name+ " , Form Number: " +num);
			return model;
		}


}
