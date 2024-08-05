package com.projeto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.curso.entidades.Categoria;
import com.projeto.curso.repositories.CategoriaRepositores;

@Service
public class CategoriaServico {
	
	@Autowired
	private CategoriaRepositores repositor;
	
	public List<Categoria> findAll(){
		return repositor.findAll();
	}
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repositor.findById(id);
		return obj.get();
	}
}
