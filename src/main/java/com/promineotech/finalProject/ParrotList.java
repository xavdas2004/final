package com.promineotech.finalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class ParrotList {

	public static void main(String[] args) {
		SpringApplication.run(ParrotList.class, args);
	}

}
