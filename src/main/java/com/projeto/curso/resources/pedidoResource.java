package com.projeto.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.curso.entidades.pedido;
import com.projeto.curso.services.pedidoServico;

@RestController
@RequestMapping(value = "/pedido")
public class pedidoResource {
	
	@Autowired
	private pedidoServico Service;
	
	@GetMapping
	public ResponseEntity<List<pedido>> findAll(){
		List<pedido> list = Service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<pedido> findById(@PathVariable Long id){
		pedido obj = Service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}














