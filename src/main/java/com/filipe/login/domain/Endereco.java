package com.filipe.login.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Endereco {
	private int id;
	private String endereco;

	private List<Usuario> usuarios = new ArrayList<>();

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(int id, String endereco) {
		super();
		this.id = id;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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
		Endereco other = (Endereco) obj;
		return id == other.id;
	}

}
