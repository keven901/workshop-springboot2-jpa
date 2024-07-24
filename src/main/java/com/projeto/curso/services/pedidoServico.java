package com.projeto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.curso.entidades.pedido;
import com.projeto.curso.repositories.PedidoRepositores;

@Service
public class pedidoServico {
	
	@Autowired
	private PedidoRepositores repositor;
	
	public List<pedido> findAll(){
		return repositor.findAll();
	}
	
	public pedido findById(Long id) {
		Optional<pedido> obj = repositor.findById(id);
		return obj.get();
	}
}
