package com.filipe.login.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filipe.login.domain.Endereco;
import com.filipe.login.domain.Telefone;
import com.filipe.login.domain.Usuario;
import com.filipe.login.repositories.EnderecoRepository;
import com.filipe.login.repositories.TelefoneRespository;
import com.filipe.login.repositories.UsuarioRepository;

@Service
public class DBservice {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private TelefoneRespository telefoneRespository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void instanciaDB() {
		Endereco endereco1 = new Endereco(1, "Fazenda Trairinha Zona Rural");
		Telefone telefone1 = new Telefone(1, 9990889);
		
		Usuario usuario1 = new Usuario(121984146, "Filipe", "Pereira da Silva", endereco1, telefone1);
		
		endereco1.getUsuarios().addAll(Arrays.asList(usuario1));
		telefone1.getUsuarios().addAll(Arrays.asList(usuario1));
		
		this.enderecoRepository.saveAll(Arrays.asList(endereco1));
		this.telefoneRespository.saveAll(Arrays.asList(telefone1));
		this.usuarioRepository.saveAll(Arrays.asList(usuario1));
	}

}
