package com.CourseVoiliers.FlotsBleus.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseVoiliers.FlotsBleus.model.VoiliersModel;

public interface VoiliersRepository extends JpaRepository<VoiliersModel,Integer> {

	

}