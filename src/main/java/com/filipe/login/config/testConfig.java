package com.filipe.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.filipe.login.services.DBservice;

@Configuration
@Profile("test")
public class testConfig {

	@Autowired
	private DBservice dbservice;
	
	@Bean
	public void instanciaDB() {
		this.dbservice.instanciaDB();
	}
}
