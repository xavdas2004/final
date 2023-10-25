package com.promineotech.finalProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Continent {
	private Long continentID;
	private String continentName;
	@JsonIgnore
	  public Long getContinentID() {
	    return continentID;
	  } // end getOrderPK
}
