package com.CourseVoiliers.FlotsBleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseVoiliers.FlotsBleus.model.TypeVoilersModel;
import com.CourseVoiliers.FlotsBleus.repository.TypeVoilersRepository;

@Service
public class TypeVoilersService {
	@Autowired
	private TypeVoilersRepository ir;
	
	public Iterable<TypeVoilersModel> getAlltypeVoiliers()
	{
		return ir.findAll();
	}
}
