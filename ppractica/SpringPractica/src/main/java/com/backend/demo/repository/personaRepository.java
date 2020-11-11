package com.backend.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.backend.demo.modelo.persona;

public interface personaRepository extends CrudRepository<persona, Integer> {
	public List<persona> findAll();
}
