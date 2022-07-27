package com.eliasroy.systemestudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliasroy.systemestudiante.model.Estudiante;
import com.eliasroy.systemestudiante.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRepository repo;
	@Override
	public Estudiante saveEstudent(Estudiante student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}
	@Override
	public List<Estudiante> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
}
