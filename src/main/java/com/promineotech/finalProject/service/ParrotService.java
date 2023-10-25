package com.promineotech.finalProject.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.promineotech.finalProject.entity.Cockatoo;
import com.promineotech.finalProject.entity.Continent;
import com.promineotech.finalProject.entity.Conure;
import com.promineotech.finalProject.entity.Macaw;
import com.promineotech.finalProject.entity.ParrotContinent;
import com.promineotech.finalProject.entity.ParrotGroup;

public interface ParrotService {
//Cockatoo,Macaw,Conure
	public List<Cockatoo> getCockatooData() ;
	
	
	public List<Macaw> getMacawData();
	
	
	public List<Conure> getConureData();
	
//ParrotGroup
//	public ParrotGroup createParrotGroup(ParrotGroup parrotGroup);
	
	
	public List<ParrotGroup> getParrotGroup();
	
	
//	public ParrotGroup updateParrotGroupByID(Long parrotID, Long setCockatooID, Long setMacawID, Long setConureID, ParrotGroup updateParrotGroup);
	
	
//	public void deleteParrotGroupByID(Long parrotGroupID);
	
//Continent	
	public Continent createContinent(String continentName);
	
	
	public List<Continent> getContinent();
	
	
	public Continent updateContinentName(String continentName, String newContinentName);
	
	
	public void deleteContinent(String continentName);
	
//ParrotContinents
	public List<ParrotContinent> getParrotContinent();
	

//	public ParrotContinent updateParrotContinent(Long parrotID, Long continentID, Long newParrotID, Long newContinentID);
	
}
