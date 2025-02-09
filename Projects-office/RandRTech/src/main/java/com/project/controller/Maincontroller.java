package com.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Maincontroller {

	@GetMapping("/home")
	public String home(Model model) {

		List<String> images = List.of("gallery1.jpg", "gallery2.jpg", "gallery3.jpg", "gallery4.jpg", "gallery5.jpg",
				"gallery6.jpg");
		model.addAttribute("galleryImages", images);

		return "home";
	}

	@GetMapping("/service")
	public String service() {

		return "service";
	}
	
	@GetMapping("/services/modularOT")
	public String modularot() {
		
		return "/services/modularOT";
	}
	@GetMapping("/services/hvac")
	public String hvac() {
		
		return "services/hvac";
	}
	@GetMapping("/services/cleanroom")
	public String cleanroom() {
		
		return "services/cleanroom";
	}
	@GetMapping("/services/mgps")
	public String mgps() {
		
		return "/services/mgps";
	}
	@GetMapping("/services/flooring")
	public String flooring() {
		
		return "/services/flooring";
	}
	@GetMapping("/services/equipment")
	public String medicalequipments() {
		
		return "/services/equipment";
	}
	
	@GetMapping("/services/ivf")
	public String ivf() {
		
		return "/services/ivf";
	}
	
	@GetMapping("/services/icu")
	public String icu() {
		
		return "/services/icu";
	}
	
	@GetMapping("/ourcompany")
	public String ourcompany() {

		return "company";
	}

	@GetMapping("/contact")
	public String contact() {

		return "contact";
	}


}
