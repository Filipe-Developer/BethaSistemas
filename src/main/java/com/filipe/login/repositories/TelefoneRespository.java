package com.filipe.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipe.login.domain.Telefone;

@Repository
public interface TelefoneRespository extends JpaRepository<Telefone, Integer>{

}
