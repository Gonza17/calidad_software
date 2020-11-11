package com.backend.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.demo.modelo.persona;
import com.backend.demo.repository.personaRepository;
import com.backend.demo.service.personaservice;

@Service
public class personaserviceimp implements personaservice {
	
	@Autowired
	private personaRepository repositorio;
	
	@Override
	public List<persona> Listar() {
		return repositorio.findAll();
	}

	@Override
	public persona listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public persona add(persona p) {
		return repositorio.save(p);
	}

	@Override
	public persona edit(persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
