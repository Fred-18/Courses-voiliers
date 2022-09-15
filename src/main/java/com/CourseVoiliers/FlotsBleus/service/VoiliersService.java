package com.CourseVoiliers.FlotsBleus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseVoiliers.FlotsBleus.model.VoiliersModel;

import com.CourseVoiliers.FlotsBleus.repository.VoiliersRepository;

@Service
public class VoiliersService {
	@Autowired
	private VoiliersRepository vr;
	
	public Iterable<VoiliersModel> getAllVoiliers()
	{
		return vr.findAll();
	}
	
	public Optional<VoiliersModel> getVoiliersById(Integer id)
	{
		return vr.findById(id);
	}

}