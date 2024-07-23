package com.projeto.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.curso.entidades.usuario;

@RestController
@RequestMapping(value = "/usuario")
public class usuarioResource {
	
	@GetMapping
	public ResponseEntity<usuario> findAll(){
		usuario u = new usuario(1L, "Claudio", "Claudinhobuxexa@gmail.com","+5511987342025", "claudiopressaum");
		return ResponseEntity.ok().body(u);
	}
}
