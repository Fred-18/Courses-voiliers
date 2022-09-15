package com.CourseVoiliers.FlotsBleus;controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CourseVoiliers.FlotsBleus.service.EntrepriseService;

@Controller
public class EntrepriseController {

	@Autowired
	EntrepriseService es;
	
	@GetMapping("/sponsors")
	public String getSponsor(Model model) {
		
		model.addAttribute("sponsors", es.getAllSponsor());
		return "sponsors";
	}
}
