package com.backend.demo.service;

import java.util.List;

import com.backend.demo.modelo.persona;

public interface personaservice {
	public List<persona> Listar();
	public persona listarId(int id);
	public persona add(persona p);
	public persona edit(persona p);
	public persona delete(int id);
}
