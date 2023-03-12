package com.example.finalProjGrp7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalProjGrp7.model.ProductRepository;

@CrossOrigin(origins ="http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ProdcutController {

	@Autowired
	ProductRepository productRepo;
	
	
		
	
	
}
