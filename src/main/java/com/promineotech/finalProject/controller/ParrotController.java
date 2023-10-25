package com.promineotech.finalProject.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.finalProject.entity.Cockatoo;
import com.promineotech.finalProject.entity.Continent;
import com.promineotech.finalProject.entity.Conure;
import com.promineotech.finalProject.entity.Macaw;
import com.promineotech.finalProject.entity.ParrotContinent;
import com.promineotech.finalProject.entity.ParrotGroup;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.Parameter;

@RequestMapping("/parrot")
@OpenAPIDefinition(info = @Info(title = "Parrot Group Controller"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server.") })
// @formatter:off
public interface ParrotController {
	@Operation(summary = "Get the contents of  the Cockatoo table", description = "Retrieves a list of the contents of the Cockatoo table", responses = {
			@ApiResponse(responseCode = "200", description = "Cockatoo table retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cockatoo.class))),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@GetMapping("/cockatoo")
	List<Cockatoo> getCockatooData();
	
	@Operation(summary = "Get the contents of the Macaw table", description = "Retrieves a list of the contents of the Macaw table", responses = {
			@ApiResponse(responseCode = "200", description = "Macaw table retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Macaw.class))),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@GetMapping("/macaw")
	List<Macaw> getMacawData();
	
	@Operation(summary = "Get the contents of the Conure table", description = "Retrieves a list of the contents of the Conure table", responses = {
			@ApiResponse(responseCode = "200", description = "Conure table retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Conure.class))),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@GetMapping("/conure")
	List<Conure> getConureData();
	


//	@Operation(summary = "Create a new parrot group", description = "Creates a new parrot group", responses = {
//			@ApiResponse(responseCode = "200", description = "New parrot group created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ParrotGroup.class))),
//			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json")),
//			@ApiResponse(responseCode = "404", description = "Not found", content = @Content(mediaType = "application/json")),
//			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json"))
//		      },
//			parameters = {
//					@Parameter(name = "parrotGroup", required = true, description = "Enter the name of the new parrot group you want to add.")
//	})
//
//	@PostMapping("/parrotGroup")
//	ParrotGroup createParrotGroup(@RequestParam ParrotGroup parrotGroup);
		
		
	@Operation(summary = "Get a list of parrot groups", description = "Retrieves a list of parrot groups", responses = {
			@ApiResponse(responseCode = "200", description = "List of parrot groups retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ParrotGroup.class))),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@GetMapping("/parrotGroup")
	List<ParrotGroup> getParrotGroup();
		
		
//	@Operation(summary = "Update an existing parrot group", description = "Updates an existing parrot group", responses = {
//			@ApiResponse(responseCode = "200", description = "Existing parrot group updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ParrotGroup.class))),
//			@ApiResponse(responseCode = "400", description = "Bad request"),
//			@ApiResponse(responseCode = "404", description = "Not found"),
//			@ApiResponse(responseCode = "500", description = "Internal server error")
//	})
//	@PutMapping("/parrotGroup/{parrotID}")
//	ParrotGroup updateParrotGroupByID(
//			@PathVariable Long parrotID, 
//			@RequestParam(required = false) Long setCockatooID, 
//		    @RequestParam(required = false) Long setMacawID, 
//		    @RequestParam(required = false)Long setConureID, 
//			@RequestBody ParrotGroup updateParrotGroup);
		
		
//	@Operation(summary = "Delete a parrot group by ID", description = "Deletes an existing parrot group by its ID", responses = {
//			@ApiResponse(responseCode = "204", description = "Parrot group deleted successfully"),
//			@ApiResponse(responseCode = "400", description = "Bad request"),
//			@ApiResponse(responseCode = "404", description = "Not found"),
//			@ApiResponse(responseCode = "500", description = "Internal server error")
//	})
//	@DeleteMapping("/parrotGroup/{parrotGroupID}")
//	void deleteParrotGroupByID(Long parrotGroupID);

		
		
	@Operation(summary = "Create a new continent", description = "Creates a new continent", responses = {
			@ApiResponse(responseCode = "200", description = "New continent created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Continent.class))),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "404", description = "Not found", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json"))
	},
	parameters = {
		@Parameter(name = "continentName", required = true, description = "Enter the continent's name: ")})

	@PostMapping("/continent")
	Continent createContinent(@RequestParam(required = true) String continentName);

	
	
	@Operation(summary = "Get a list of continents", description = "Retrieves a list of continents", responses = {
		    @ApiResponse(responseCode = "200", description = "List of continents retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Continent.class))),
		    @ApiResponse(responseCode = "400", description = "Bad request"),
		    @ApiResponse(responseCode = "404", description = "Not found"),
		    @ApiResponse(responseCode = "500", description = "Internal server error")
	})	
	@GetMapping("/continent")
	List<Continent> getContinent();
	
	
	
	@Operation(summary = "Update an existing continent", description = "Updates the name of a previously existing continent", responses = {
			@ApiResponse(responseCode = "200", description = "Existing continent updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Continent.class))),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@PutMapping("/continent/{continentName}")
	Continent updateContinentName(
			@PathVariable("continentName") String continentName,
			@RequestParam(name = "newContinentName", required = true) String newContinentName);
	// @formatter:on
	
	
	
	@Operation(summary = "Delete a continent", description = "Deletes an existing continent", responses = {
			@ApiResponse(responseCode = "200", description = "Continent deleted successfully"),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@DeleteMapping("/continent")
	void deleteContinent(@RequestParam(name = "continentName", required = true) String continentName);

		 
		
	//ParrotContinents
	@Operation(summary = "Get a list of Parrot relationships to Continents", description = "Retrieves a list of Parrot-Continent relationships", responses = {
			@ApiResponse(responseCode = "200", description = "List of Parrot-Continents retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ParrotGroup.class))),
			@ApiResponse(responseCode = "400", description = "Bad request"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "Internal server error")
	})
	@GetMapping("/parrotContinent")
	List<ParrotContinent> getParrotContinent();
		
		
//	@Operation(summary = "Update an existing continent", description = "Updates a Parrot's relationship to a Continent", responses = {
//			@ApiResponse(responseCode = "200", description = "Existing ParrotContinent updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ParrotContinent.class))),
//			@ApiResponse(responseCode = "400", description = "Bad request"),
//			@ApiResponse(responseCode = "404", description = "Not found"),
//			@ApiResponse(responseCode = "500", description = "Internal server error")
//	})
//	@PutMapping("/parrotContinent/{parrotID}/{continentID}")
//	ParrotContinent updateParrotContinent(
//			@PathVariable("parrotID") Long parrotID, 
//			@PathVariable("continentID") Long continentID,
//			Long newParrotID,
//			Long newContinentID);
//	// @formatter:on
}
