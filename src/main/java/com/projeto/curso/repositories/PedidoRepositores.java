package com.projeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.curso.entidades.pedido;

public interface PedidoRepositores extends JpaRepository<pedido, Long> {
	
}
