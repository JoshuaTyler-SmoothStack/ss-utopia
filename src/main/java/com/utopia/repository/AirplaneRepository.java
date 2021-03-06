package com.utopia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.utopia.model.Airplane;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
	
	@Query(value="SELECT * FROM airplane", nativeQuery=true)
	List<Airplane> getAllAirplanes();
	
	@Query(value="SELECT * FROM airplane WHERE id = 1?", nativeQuery=true)
	Airplane getAirplaneWithId(Integer id);
	
	@Query(value="SELECT * FROM airplane WHERE type_id = 1?", nativeQuery=true)
	List<Airplane> getAirplanesWithTypeId(Integer id);
	
}