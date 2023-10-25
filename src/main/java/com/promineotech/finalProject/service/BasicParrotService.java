package com.promineotech.finalProject.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.finalProject.dao.ParrotDao;
import com.promineotech.finalProject.entity.Cockatoo;
import com.promineotech.finalProject.entity.Continent;
import com.promineotech.finalProject.entity.Conure;
import com.promineotech.finalProject.entity.Macaw;
import com.promineotech.finalProject.entity.ParrotContinent;
import com.promineotech.finalProject.entity.ParrotGroup;


import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class BasicParrotService implements ParrotService {

@Autowired

private ParrotDao parrotDao;

	@Override
	//@Transactional(readOnly = true)
	public List<Cockatoo> getCockatooData() {
		log.info("getCockatooData method called");
		return parrotDao.getCockatooData();
	}

	@Override
	public List<Macaw> getMacawData() {
		log.info("getMacawData method called");
		return parrotDao.getMacawData();
	}

	@Override
	public List<Conure> getConureData() {
		log.info("getConureData method called");
		return parrotDao.getConureData();
	}

//	@Override
//	public ParrotGroup createParrotGroup(ParrotGroup parrotGroup) {
//		log.info("createParrotGroup method called");
//		return parrotDao.createParrotGroup(parrotGroup);
//		
//	}

	@Override
	public List<ParrotGroup> getParrotGroup() {
		log.info("getParrotGroup method called");
		return parrotDao.getParrotGroup();
	}

//	@Override
//	public ParrotGroup updateParrotGroupByID(Long parrotID, Long setCockatooID, Long setMacawID, Long setConureID, ParrotGroup updateParrotGroup) {
//		log.info("updateParrotGroupByID method called");
//		return parrotDao.updateParrotGroupByID(parrotID, setCockatooID, setMacawID, setConureID, updateParrotGroup);
//	}

//	@Override
//	public void deleteParrotGroupByID(Long parrotGroupID) {
//		log.info("deleteParrotGroupByID method called");
//		
//		
//	}

	@Override
	public Continent createContinent(String continent) {
		log.info("createContinent method called");
		return parrotDao.createContinent(continent);
	}

	@Override
	public List<Continent> getContinent() {
		log.info("getContinent method called");
		return parrotDao.getContinent();
	}

	@Override
	public Continent updateContinentName(String continentName, String newContinentName) {
		log.info("updateContinentName method called");
		return parrotDao.updateContinentName(continentName, newContinentName);
	}
	
	@Override
	public void deleteContinent(String continentName) {
		log.info("deleteContinent method called");
		parrotDao.deleteContinent(continentName);
	}

	@Override
	public List<ParrotContinent> getParrotContinent() {
		log.info("getParrotContinent method called");
		return parrotDao.getParrotContinent();
	}

//	@Override
//	public ParrotContinent updateParrotContinent(Long parrotID, Long continentID, Long newParrotID, Long newContinentID) {
//		log.info("updateParrotContinent method called");
//		return parrotDao.updateParrotContinent(parrotID, continentID, newParrotID, newContinentID);
//	}
	
}
