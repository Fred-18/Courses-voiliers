package com.CourseVoiliers.FlotsBleus.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CourseVoiliers.FlotsBleus.model.EquipageModel;
import com.CourseVoiliers.FlotsBleus.repository.EquipageRepository;
@Service
public class EquipageService {

	@Autowired
	private EquipageRepository er;
	public Optional<EquipageModel>getequipage(int id){
		return er.findById(id);
	}
	public Iterable<EquipageModel>getEquipages(){
		return er.findAll();
	}
	 
}
;