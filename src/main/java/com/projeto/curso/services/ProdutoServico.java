package com.projeto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.curso.entidades.Produto;
import com.projeto.curso.repositories.ProdutoRepositores;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositores repositor;
	
	public List<Produto> findAll(){
		return repositor.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj = repositor.findById(id);
		return obj.get();
	}
}
