package com.CourseVoiliers.FlotsBleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.CourseVoiliers.FlotsBleus.model.TypeVoiliersModel;
import com.CourseVoiliers.FlotsBleus.repository.TypeVoiliersRepository;

@Service
public class TypeVoiliersService {
	@Autowired
	private TypeVoiliersRepository ir;
	
	public Iterable<TypeVoiliersModel> getAlltypeVoiliers()
	{
		return ir.findAll();
	}
}
