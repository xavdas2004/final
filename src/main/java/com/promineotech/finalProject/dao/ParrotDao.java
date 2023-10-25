package com.promineotech.finalProject.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.promineotech.finalProject.entity.Cockatoo;
import com.promineotech.finalProject.entity.Continent;
import com.promineotech.finalProject.entity.Conure;
import com.promineotech.finalProject.entity.Macaw;
import com.promineotech.finalProject.entity.ParrotContinent;
import com.promineotech.finalProject.entity.ParrotGroup;


public interface ParrotDao {
	//method to get data from the cockatoo table
	/**
	 * 
	 * @param cockatooID
	 * @param size
	 * @param colors
	 * @param habitat
	 * @param description
	 * @return
	 * 
	 */
	public List<Cockatoo> getCockatooData();
	
	//method to get data from the macaw table
	/**
	 * 
	 * @param macawID
	 * @param size
	 * @param colors
	 * @param habitat
	 * @param description
	 * @return
	 * 
	 */
	public List<Macaw> getMacawData();
	
	//method to get data from the conure table
	/**
	 * 
	 @param conureID
	 * @param size
	 * @param colors
	 * @param habitat
	 * @param description
	 * @return
	 * 
	 */
	public List<Conure> getConureData();
	
//	//method to create a new parrot group
//	/**
//	 * 
//	 * @param parrotID
//	 * @param cockatooID
//	 * @param macawID
//	 * @param conureID
//	 * @return
//	 * 
//	 */
//	public ParrotGroup createParrotGroup(ParrotGroup parrotGroup);
	
	//method to get data from the parrot group table
	/**
	 * 
	 * @param parrotID
	 * @param cockatooID
	 * @param macawID
	 * @param conureID
	 * @return
	 * 
	 */
	public List<ParrotGroup> getParrotGroup();
	
//	//method to update an existing parrot group
//	/**
//	 * 
//	 * @param parrotID
//	 * @param cockatooID
//	 * @param macawID
//	 * @param conureID
//	 * @return 
//	 * 
//	 */
//	public ParrotGroup updateParrotGroupByID(Long parrotID, Long setCockatooID, Long setMacawID, Long setConureID, ParrotGroup updateParrotGroup);
	
//	//method to delete a parrot group by id
//	/**
//	 * 
//	 * @param parrotID
//	 * @param cockatooID
//	 * @param macawID
//	 * @param conureID
//	 * @return 
//	 * 
//	 */
//	public void deleteParrotGroupByID(Long parrotGroupID);
	
	//method to create a new continent
	/**
	 * 
	 * @param continentID
	 * @param continentName
	 * @return
	 * 
	 */
	Continent createContinent(String continentName);
	
	//method to get data from the continent table
	/**
	 * 
	 * @param continentID
	 * @param continentName
	 * @return
	 * 
	 */
	public List<Continent> getContinent();
	
	//method to update an existing continent from the continent table
		/**
		 * 
		 * @param continentName
		 * @param newContinentName
		 * @return
		 * 
		 */
	Continent updateContinentName(String continentName, String newContinentName);
	
	//method to delete a continent
	/**
	 * 
	 * @param continentID
	 * @param continentName
	 * @return
	 * 
	 */
	public void deleteContinent(String continentName);
	
	//method to get data from the parrot continent table
	/**
	 * 
	 * @param parrotID
	 * @param continentID
	 * @return
	 * 
	 */
	public List<ParrotContinent> getParrotContinent();
	
//	//method to update an existing parrot continent relation
//	/**
//	 *
//	 * @param parrotID
//	 * @param continentID
//	 * @return 
//	 * 
//	 */
//	public ParrotContinent updateParrotContinent(Long parrotID, Long continentID, Long newParrotID, Long newContinentID);

	
	
}

