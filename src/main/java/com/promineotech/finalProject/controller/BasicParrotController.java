package com.promineotech.finalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.finalProject.entity.Cockatoo;
import com.promineotech.finalProject.entity.Continent;
import com.promineotech.finalProject.entity.Conure;
import com.promineotech.finalProject.entity.Macaw;
import com.promineotech.finalProject.entity.ParrotContinent;
import com.promineotech.finalProject.entity.ParrotGroup;
import com.promineotech.finalProject.service.ParrotService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class BasicParrotController implements ParrotController{

@Autowired

private ParrotService parrotService;	
	
	@Override
	public List<Cockatoo> getCockatooData() {
		log.info("getCockatooData method called");
		return parrotService.getCockatooData();
	}

	@Override
	public List<Macaw> getMacawData() {
		log.info("getMacawData method called");
		return parrotService.getMacawData();
	}

	@Override
	public List<Conure> getConureData() {
		log.info("getConureData method called");
		return parrotService.getConureData();
	}

//	@Override
//	public ParrotGroup createParrotGroup(ParrotGroup parrotGroup) {
//		log.info("createParrotGroup method called");
//		return parrotService.createParrotGroup(parrotGroup);
//		
//	}

	@Override
	public List<ParrotGroup> getParrotGroup() {
		log.info("getParrotGroup method called");
		return parrotService.getParrotGroup();
	}

//	@Override
//	public ParrotGroup updateParrotGroupByID(Long parrotID, Long setCockatooID, Long setMacawID, Long setConureID, ParrotGroup updateParrotGroup) {
//		log.info("updateParrotGroupByID method called");
//		return parrotService.updateParrotGroupByID(parrotID, setCockatooID, setMacawID, setConureID, updateParrotGroup);
//	}

//	@Override
//	public void deleteParrotGroupByID(Long parrotGroupID) {
//		log.info("deleteParrotGroupByID method called");
//		
//	}

	@Override
	public Continent createContinent(String continentName) {
		log.info("createContinent method called");
		return parrotService.createContinent(continentName);
	}
	
	@Override
	public List<Continent> getContinent() {
		log.info("getContinent method called");
		return parrotService.getContinent();
	}
	
	@Override
	public Continent updateContinentName(String continentName, String newContinentName) {
		log.info("updateContinentName method called");
		return parrotService.updateContinentName(continentName, newContinentName);
	}
	
	@Override
	public void deleteContinent(String continentName) {
		log.info("deleteContinent method called");
		parrotService.deleteContinent(continentName);
	}

	@Override
	public List<ParrotContinent> getParrotContinent() {
		log.info("getParrotContinent method called");
		return parrotService.getParrotContinent();
	}

//	@Override
//	public ParrotContinent updateParrotContinent(Long parrotID, Long continentID, Long newParrotID, Long newContinentID) {
//		log.info("updateParrotContinent method called");
//		return parrotService.updateParrotContinent(parrotID, continentID, newParrotID, newContinentID);
//	}

	
}
