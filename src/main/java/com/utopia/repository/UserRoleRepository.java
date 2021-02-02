package com.utopia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.utopia.model.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {
	
	@Query(value="SELECT * FROM user_role WHERE id = 1?", nativeQuery=true)
	UserRole findUserRoleById(int id);

	@Query(value="SELECT * FROM user_role WHERE name = 1?", nativeQuery=true)
	UserRole findUserRoleByName(String name);
	
}
