package com.projeto.curso.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.curso.entidades.usuario;
import com.projeto.curso.services.servico;

@RestController
@RequestMapping(value = "/usuario")
public class usuarioResource {
	
	private servico Service;
	
	@GetMapping
	public ResponseEntity<List<usuario>> findAll(){
		List<usuario> list = Service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<usuario> findById(@PathVariable Long id){
		usuario obj = Service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}














