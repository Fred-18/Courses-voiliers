package com.CourseVoiliers.FlotsBleus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CourseVoiliers.FlotsBleus.model.EquipageModel;
@Repository
public interface EquipageRepository extends CrudRepository<EquipageModel,Integer>{

}
