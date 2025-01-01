package com.example.devops.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
<<<<<<< HEAD
	public String welocme(Model model) {
		
=======
	public String welcome(Model model) {
>>>>>>> feature/nv101_initial_landing_homepage
		model.addAttribute("course","DevOps");
		return "index";
	}
	
<<<<<<< HEAD
	
=======
>>>>>>> feature/nv101_initial_landing_homepage

}
