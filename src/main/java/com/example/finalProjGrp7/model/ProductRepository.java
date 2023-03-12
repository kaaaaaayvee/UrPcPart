package com.example.finalProjGrp7.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<ProductPojo, Long> {
//	List<Country> findByName(String name); // SOFTWARE ENGINNERING
//	List<Country> findByCode(String code);
//	Optional<Country> findById(String id);
//	Optional<Country> addCountry(Country newCountry);
	
}