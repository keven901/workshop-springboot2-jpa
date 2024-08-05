package com.projeto.curso.entidades;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.curso.entidades.enums.statusPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
;

@Entity
@Table(name = "tb_pedido")
public class pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone= "GMT")
	private Instant moment;
	
	private Integer StatusPedido;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private usuario cliente;
	
	
	public pedido() {
		
	}


	
	public pedido(Long id, Instant moment,statusPedido StatusPedido, usuario cliente) {
		super();
		this.id = id;
		this.moment = moment;
		setStatusPedido(StatusPedido);
		this.cliente = cliente;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Instant getMoment() {
		return moment;
	}


	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	

	public statusPedido getStatusPedido() {
		return statusPedido.valueOf(StatusPedido);
	}



	public void setStatusPedido(statusPedido statusPedido) {
		if (statusPedido != null) {
			StatusPedido = statusPedido.getCode();
		}
	}


	public usuario getCliente() {
		return cliente;
	}


	public void setCliente(usuario cliente) {
		this.cliente = cliente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pedido other = (pedido) obj;
		return Objects.equals(id, other.id);
	}
	
}
