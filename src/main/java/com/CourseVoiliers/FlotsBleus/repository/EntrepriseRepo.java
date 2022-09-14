package com.CourseVoiliers.FlotsBleus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CourseVoiliers.FlotsBleus.model.Entreprise;

@Repository
public interface EntrepriseRepo extends CrudRepository<Entreprise, Integer>{

}
