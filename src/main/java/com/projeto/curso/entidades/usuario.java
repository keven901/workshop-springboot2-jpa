package com.projeto.curso.entidades;

import java.io.Serializable;
import java.util.Objects;

public class usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String telefone;
	private String senha;
	
	public usuario() {
		
	}

	public usuario(Long id, String name, String email, String telefone, String senha) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
		usuario other = (usuario) obj;
		return Objects.equals(id, other.id);
	}
	
}
