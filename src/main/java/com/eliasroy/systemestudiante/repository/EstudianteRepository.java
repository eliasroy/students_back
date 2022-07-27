package com.eliasroy.systemestudiante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eliasroy.systemestudiante.model.Estudiante;
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer>{

}
