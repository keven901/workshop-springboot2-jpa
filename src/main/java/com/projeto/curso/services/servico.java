package com.projeto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.curso.entidades.usuario;
import com.projeto.curso.repositories.repositores;

@Service
public class servico {
	
	@Autowired
	private repositores repositor;
	
	public List<usuario> findAll(){
		return repositor.findAll();
	}
	
	public usuario findById(Long id) {
		Optional<usuario> obj = repositor.findById(id);
		return obj.get();
	}
}
