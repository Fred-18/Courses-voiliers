package com.CourseVoiliers.FlotsBleus.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="voilier")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoiliersModel {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_voilier;
	
	private String nom_voilier;
	
	private int longeur;
	
	private int largeur;
	
	private int const_annee;
	
	private int nb_victoire;
	
	private String image_voilier;
	
	/*@OneToOne(cascade = CascadeType.All)
	@JoinColumn(name="fk_id_type")*/
	/*private int id_type;*/
	


}