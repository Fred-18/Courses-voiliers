package com.CourseVoiliers.FlotsBleus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CourseVoiliers.FlotsBleus.model.Voilier;

@Repository
public interface VoilierRepo extends CrudRepository<Voilier, Integer>{

}
