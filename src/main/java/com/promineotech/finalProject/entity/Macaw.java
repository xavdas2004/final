package com.promineotech.finalProject.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Macaw {
	private Long macawID;
	private String size;
	private String colors;
	private String habitat;
	private String description;
}
