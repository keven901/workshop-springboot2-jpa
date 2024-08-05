package com.projeto.curso.entidades.enums;

public enum statusPedido {
	Eperando_pagamento(1),
	Pago(2),
	Enviado(3),
	Entegue(4),
	Cancelado(5);
	
	private int code;
	private statusPedido(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static statusPedido valueOf(int code) {
		for (statusPedido value : statusPedido.values()) {
			if(value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Ordem de pedido invalida");
	}
}
