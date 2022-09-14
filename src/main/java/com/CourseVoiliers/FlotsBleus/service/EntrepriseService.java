package com.CourseVoiliers.FlotsBleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseVoiliers.FlotsBleus.model.Entreprise;
import com.CourseVoiliers.FlotsBleus.repository.EntrepriseRepo;

@Service
public class EntrepriseService {

	@Autowired
	private EntrepriseRepo er;
	
	public Iterable<Entreprise> getAllSponsor() {
		return er.findAll();
	}
}
