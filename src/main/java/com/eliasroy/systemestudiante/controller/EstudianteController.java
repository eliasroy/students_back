package com.eliasroy.systemestudiante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliasroy.systemestudiante.model.Estudiante;
import com.eliasroy.systemestudiante.service.EstudianteService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class EstudianteController {

	@Autowired
	private EstudianteService service;
	
	/*http://localhost:8090/student/add */
	@PostMapping("/add")
	public String add(@RequestBody Estudiante student) {
		service.saveEstudent(student);
		return "SE GUARDO";
	}
	
	/*http://localhost:8090/student/add */
	@GetMapping("/listar")
	public List<Estudiante> listar() {
		return service.listar();
	}
}
