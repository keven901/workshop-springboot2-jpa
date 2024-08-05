package com.projeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.curso.entidades.Produto;

public interface ProdutoRepositores extends JpaRepository<Produto, Long> {
	
}
