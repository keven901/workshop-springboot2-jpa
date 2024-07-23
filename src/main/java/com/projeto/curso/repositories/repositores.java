package com.projeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.curso.entidades.usuario;

public interface repositores extends JpaRepository<usuario, Long> {
	
}
