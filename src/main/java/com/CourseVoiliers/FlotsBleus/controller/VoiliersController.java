package com.CourseVoiliers.FlotsBleus.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CourseVoiliers.FlotsBleus.service.TypeVoiliersService;
import com.CourseVoiliers.FlotsBleus.service.VoiliersService;



@Controller
public class VoiliersController {
	
	@Autowired
	private VoiliersService vs;
	
	@GetMapping("/Voiliers")
	public String voiliers( Model model)
	{
		
		model.addAttribute("voiliers",vs.getAllVoiliers());
		return "publicTemplates/Voiliers";
	}
	
	@GetMapping("/admin/DashboardVoilier")
	public String adminvoiliers( Model model)
	{
		
		model.addAttribute("voiliers",vs.getAllVoiliers());
		return "adminTemplates/DashboardVoilier";
	}
	@GetMapping("/Voilierslink/{id}")
	public String voiliersId(@PathVariable Integer id,Model model)
	{
		model.addAttribute("voiliers",vs.getVoiliersById(id).orElse(null));
		
		return "publicTemplates/Voilierslink";
	}
	@Autowired
	private TypeVoiliersService tvs;
	
	@GetMapping({"/","index"})
	public String Type_Voilers(Model model)
	{
		
		model.addAttribute("type_voiliers",tvs.getAlltypeVoiliers());
		return "publicTemplates/index";
	}
	
	@GetMapping("/Quisommesnous")
	public String quisommenous()
	{
		return "publicTemplates/Quisommesnous";
	}
	
}