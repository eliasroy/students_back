package com.eliasroy.systemestudiante.service;

import java.util.List;

import com.eliasroy.systemestudiante.model.Estudiante;

public interface EstudianteService {

	public Estudiante saveEstudent(Estudiante student);
	public List<Estudiante> listar();
}
