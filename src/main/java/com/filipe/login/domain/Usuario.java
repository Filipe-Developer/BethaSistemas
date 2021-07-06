package com.filipe.login.domain;

import java.util.Objects;

public class Usuario {
	private char cpf;
	private String nome, sobrenome;

	private Endereco endereco;
	private Telefone telefone;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(char cpf, String nome, String sobrenome, Endereco endereco, Telefone telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public char getCpf() {
		return cpf;
	}

	public void setCpf(char cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return cpf == other.cpf;
	}

}
