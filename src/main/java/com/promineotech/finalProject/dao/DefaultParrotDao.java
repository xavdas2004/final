package com.promineotech.finalProject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.promineotech.finalProject.entity.Cockatoo;
import com.promineotech.finalProject.entity.Continent;
import com.promineotech.finalProject.entity.Conure;
import com.promineotech.finalProject.entity.Macaw;
import com.promineotech.finalProject.entity.ParrotContinent;
import com.promineotech.finalProject.entity.ParrotGroup;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultParrotDao implements ParrotDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public List<Cockatoo> getCockatooData() {
		log.info("DAO: getCockatooData method called");

		//@formatter:off
		String sql = ""
			+ "SELECT * "
			+ "FROM Cockatoo";
		//@formatter:on
		return jdbcTemplate.query(sql, new RowMapper<>() {

			@Override
			public Cockatoo mapRow(ResultSet rs, int rowNum) throws SQLException {
				//@formatter:off
				return Cockatoo.builder()
					.cockatooID(rs.getLong("cockatooID"))
					.size(rs.getString("size"))
					.colors(rs.getString("colors"))
					.habitat(rs.getString("habitat"))
					.description(rs.getString("description"))
					.build();
				};
				//@formatter:on
		});
	}

	@Override
	public List<Macaw> getMacawData() {
		log.info("DAO: getMacawData method called");
		//@formatter:off
		String sql = ""
				+ "SELECT * "
				+ "FROM Macaw";
		//@formatter:on
		return jdbcTemplate.query(sql, new RowMapper<>() {

			@Override
			public Macaw mapRow(ResultSet rs, int rowNum) throws SQLException {
				//@formatter:off
				return Macaw.builder()
						.macawID(rs.getLong("macawID"))
						.size(rs.getString("size"))
						.colors(rs.getString("colors"))
						.habitat(rs.getString("habitat"))
						.description(rs.getString("description"))
						.build();
				//@formatter:on	
			};

		});
	}

	@Override
	public List<Conure> getConureData() {
		log.info("DAO: getConureData method called");
		//@formatter:off
		String sql = ""
				+ "SELECT * "
				+ "FROM Conure";
		//@formatter:on
		return jdbcTemplate.query(sql, new RowMapper<>() {

			@Override
			public Conure mapRow(ResultSet rs, int rowNum) throws SQLException {
				//@formatter:off
				return Conure.builder()
						.conureID(rs.getLong("conureID"))
						.size(rs.getString("size"))
						.colors(rs.getString("colors"))
						.habitat(rs.getString("habitat"))
						.description(rs.getString("description"))
						.build();
				//@formatter:on
			};

		});
	}

//	@Override
//	public ParrotGroup createParrotGroup(ParrotGroup parrotGroup) {
//	    log.info("Creating a new parrotGroup: {}", parrotGroup);
//	    //@formatter:off
//	    String sql = ""
//	            + "INSERT INTO ParrotGroup "
//	    		+ "(parrotID, cockatooID, macawID, conureID) "
//	            + "VALUES (?, ?, ?, ?)";
//	    //@formatter:on
//
//	    KeyHolder keyHolder = new GeneratedKeyHolder();
//
//	    jdbcTemplate.update(sql, parrotGroup.getCockatooID(), parrotGroup.getMacawID(), parrotGroup.getConureID(),
//	            keyHolder);
//
//	    Long parrotID = keyHolder.getKey().longValue();
//
//	    return ParrotGroup.builder()
//	            .parrotID(parrotID)
//	            .cockatooID(parrotGroup.getCockatooID())
//	            .macawID(parrotGroup.getMacawID())
//	            .conureID(parrotGroup.getConureID())
//	            .build();
//	}

	@Override
	public List<ParrotGroup> getParrotGroup() {
		log.info("DAO: getParrotGroup method called");
		//@formatter:off
		String sql = ""
			+ "SELECT * "
			+ "FROM ParrotGroup";
		//@formatter:on
		return jdbcTemplate.query(sql, new RowMapper<>() {

			@Override
			public ParrotGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
				//@formatter:off
				return ParrotGroup.builder()
						.parrotID(rs.getLong("parrotID"))
						.cockatooID(rs.getLong("cockatooID"))
						.macawID(rs.getLong("macawID"))
						.conureID(rs.getLong("conureID"))
						.build();
			}
				//@formatter:on

		});
	}


		
//	@Override
//	public void deleteParrotGroupByID(Long parrotGroupID) {
//		// Prepare the SQL query
//		String sql = "DELETE FROM ParrotGroup WHERE parrotID = :parrotGroupID";
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("parrotGroupID", parrotGroupID);
//
//		jdbcTemplate.update(sql, params);
//	}

//	@Override
//	public String createContinent(String continentName) {
//		//@formatter:off
//		String sql = ""
//			+ "INSERT INTO continent (continentName) "
//			+ "VALUES (:continentName)";
//		//@formatter:on		
//		jdbcTemplate.update(sql, continentName);
//		return continentName;
//	}

	public Continent createContinent(String continentName) {
	    log.info("Creating a new continent in the Continent table.");

	    String sql = "INSERT INTO continent (continentName) SELECT ? WHERE NOT EXISTS (SELECT 1 FROM continent WHERE continentName = ?)";

	    KeyHolder keyHolder = new GeneratedKeyHolder();

	    int affectedRows = jdbcTemplate.update(
	        connection -> {
	            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	            ps.setString(1, continentName);
	            ps.setString(2, continentName);
	            return ps;
	        },
	        keyHolder);

	    if (affectedRows == 0) {
	        log.warn("Continent with name '{}' already exists", continentName);
	        return null;
	    }

	    Long continentID = keyHolder.getKey().longValue();

	    return Continent.builder()
	        .continentID(continentID)
	        .continentName(continentName)
	        .build();
	}
    
		
		
	@Override
	public List<Continent> getContinent() {
		log.info("DAO: getContinent method called");
		//@formatter:off
		String sql = ""
			+ "SELECT * "
			+ "FROM Continent";
		//@formatter:on
		return jdbcTemplate.query(sql, new RowMapper<>() {
			//@formatter:off
			@Override
			public Continent mapRow(ResultSet rs, int rowNum) throws SQLException {
				return Continent.builder()
				.continentID(rs.getLong("continentID"))
				.continentName(rs.getString("continentName"))
				.build();
			}
			//@formatter:on

			
		});
	}
	
	
	
	@Override
	public Continent updateContinentName(String continentName, String newContinentName) {
	    log.info("DAO: updateContinentName method called with continentName={}", continentName);

	    boolean newNameExists = checkContinentNameExists(newContinentName);

	    if (newNameExists) {
	        log.warn("Continent with name '{}' already exists. Update failed.", newContinentName);
	        return null;
	    }

	    String sql = "UPDATE Continent SET continentName = ? WHERE continentName = ?";
	    int rowsAffected = jdbcTemplate.update(sql, newContinentName, continentName);

	    if (rowsAffected > 0) {
	        log.info("Continent name updated successfully. Old name= {}, New name= {}", continentName, newContinentName);
	        return Continent.builder()
	                .continentName(newContinentName)
	                .build();
	    } else {
	        log.info("No Continent found with name '{}'. Update failed.", continentName);
	        return null;
	    }
	}
	
	private boolean checkContinentNameExists(String continentName) {
	    String checkSql = "SELECT COUNT(*) FROM Continent WHERE continentName = ?";
	    int count = jdbcTemplate.queryForObject(checkSql, Integer.class, continentName);
	    return count > 0;
	}

		

		@Override
		public void deleteContinent(String continentName) {
		    log.info("DAO: deleteContinent method called");
		    String sql = "DELETE FROM continent WHERE continentName = ?";
		    
		    log.info("Executing SQL: {}", sql);
		    
		    int rowsAffected = jdbcTemplate.update(sql, continentName);

		    if (rowsAffected > 0) {
		        log.info("Continent named '{}' was successfully deleted", continentName);
		    } else {
		        log.info("No continent found with name '{}'", continentName); 
		    }
		}

	

	@Override
	public List<ParrotContinent> getParrotContinent() {
		log.info("DAO: getParrotContinent method called");
		//@formatter:off
		String sql = ""
				+ "SELECT * "
				+ "FROM ParrotContinent";
		//@formatter:on
		return jdbcTemplate.query(sql, new RowMapper<>() {
			//@formatter:off
			@Override
			public ParrotContinent mapRow(ResultSet rs, int rowNum) throws SQLException {
				return ParrotContinent.builder()
				.parrotID(rs.getLong("parrotID"))
				.continentID(rs.getLong("continentID"))
				.build();
			}
			//@formatter:on

		});
	}

//	@Override
//	public ParrotContinent updateParrotContinent(Long parrotID, Long continentID, Long newParrotID, Long newContinentID) {
//		log.info("DAO: updateParrotContinent method called with parrotID={}, continentID={}", parrotID, continentID);
//		
//		String sql = "UPDATE ParrotContinent SET continentID = :newContinentID, parrotID = :newParrotID WHERE continentID = :continentID AND parrotID = :parrotID";
//
//	    int rowsAffected = jdbcTemplate.update(sql, parrotID, continentID);
//
//	    if (rowsAffected > 0) {
//	        log.info("ParrotContinent updated successfully. parrotID={}, continentID={}", parrotID, continentID);
//	    } else {
//	        log.info("No ParrotContinent found with parrotID={}, continentID={}", parrotID, continentID);
//	    }
//
//	    return ParrotContinent.builder()
//	    		.parrotID(newParrotID)
//	    		.continentID(newContinentID)
//	    		.build();
//	}
	
	
	class SqlParams {
	    String sql;
	    MapSqlParameterSource source = new MapSqlParameterSource();
	  } // end SqlParams
}
