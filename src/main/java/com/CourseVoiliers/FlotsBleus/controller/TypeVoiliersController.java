package com.CourseVoiliers.FlotsBleus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CourseVoiliers.FlotsBleus.service.TypeVoiliersService;



@Controller
public class TypeVoiliersController {
	@Autowired
	private TypeVoiliersService tvs;
	
	@GetMapping("/admin/Dashboard_typevoilier")
	public String admintypevoiliers( Model model)
	{
		
		model.addAttribute("type_voiliers",tvs.getAlltypeVoiliers());
		return "adminTemplates/Dashboard_typevoilier";
	}
}
