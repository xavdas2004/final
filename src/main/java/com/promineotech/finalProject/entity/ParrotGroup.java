package com.promineotech.finalProject.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParrotGroup {
	private Long parrotID;
	private Long cockatooID;
	private Long macawID;
	private Long conureID;
}
