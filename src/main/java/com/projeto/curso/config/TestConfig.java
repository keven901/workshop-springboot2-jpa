package com.projeto.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.curso.entidades.pedido;
import com.projeto.curso.entidades.usuario;
import com.projeto.curso.repositories.PedidoRepositores;
import com.projeto.curso.repositories.repositores;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private repositores repositores;

	@Autowired
	private PedidoRepositores PedidoRepositores;
	
	@Override
	public void run(String... args) throws Exception {
		
		usuario u1 = new usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		usuario u2 = new usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		pedido o1 = new pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		pedido o2 = new pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		pedido o3 = new pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		
		repositores.saveAll(Arrays.asList(u1,u2));
		PedidoRepositores.saveAll(Arrays.asList(o1,o2,o3));
		
		
		
		
		
	}
	
	
	
	
	
}
