package com.CourseVoiliers.FlotsBleus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name="type_voilier")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeVoilersModel {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_type;
	
	private String nom_type;
	
	

}
