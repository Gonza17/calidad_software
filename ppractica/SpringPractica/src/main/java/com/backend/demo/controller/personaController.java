package com.backend.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.demo.modelo.persona;
import com.backend.demo.service.personaservice;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/persona"})
public class personaController {
	
	@Autowired
	personaservice service;
	@GetMapping
	public List<persona>Listar(){
		return service.Listar();
	}
	
}
