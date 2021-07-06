package com.filipe.login.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Telefone {
	private int id;
	private long numero;

	private List<Usuario> usuarios = new ArrayList<>();

	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefone(int id, long numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
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
		Telefone other = (Telefone) obj;
		return id == other.id;
	}

}
