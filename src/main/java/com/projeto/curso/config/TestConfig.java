package com.projeto.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.curso.entidades.Categoria;
import com.projeto.curso.entidades.Produto;
import com.projeto.curso.entidades.pedido;
import com.projeto.curso.entidades.usuario;
import com.projeto.curso.entidades.enums.statusPedido;
import com.projeto.curso.repositories.CategoriaRepositores;
import com.projeto.curso.repositories.PedidoRepositores;
import com.projeto.curso.repositories.ProdutoRepositores;
import com.projeto.curso.repositories.repositores;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private repositores repositores;

	@Autowired
	private PedidoRepositores PedidoRepositores;
	
	@Autowired
	private CategoriaRepositores categoriaRepositores;
	
	@Autowired
	private ProdutoRepositores produtoRepositores;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Electronics");
		Categoria cat2 = new Categoria(null, "Books");
		Categoria cat3 = new Categoria(null, "Computers"); 
		
		Produto p1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Produto p2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Produto p3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Produto p4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Produto p5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		categoriaRepositores.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepositores.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		usuario u1 = new usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		usuario u2 = new usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		pedido o1 = new pedido(null, Instant.parse("2019-06-20T19:53:07Z"), statusPedido.Pago, u1);
		pedido o2 = new pedido(null, Instant.parse("2019-07-21T03:42:10Z"),statusPedido.Eperando_pagamento, u2);
		pedido o3 = new pedido(null, Instant.parse("2019-07-22T15:21:22Z"), statusPedido.Eperando_pagamento, u1);
		
		
		repositores.saveAll(Arrays.asList(u1,u2));
		PedidoRepositores.saveAll(Arrays.asList(o1,o2,o3));
		
		
		
		
		
	}
	
	
	
	
	
}
