package com.projeto.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.curso.entidades.usuario;
import com.projeto.curso.repositories.repositores;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private repositores repositores;

	@Override
	public void run(String... args) throws Exception {
		
		usuario u1 = new usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		usuario u2 = new usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		repositores.saveAll(Arrays.asList(u1,u2));
		
		
		
		
		
	}
	
	
	
	
	
}
