package com.filipe.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.filipe.login.services.DBservice;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBservice dBservice;
	
	@Value("$(spring.jpa.hibernate.ddl-auto)")
	private String strategy;
	
	@Bean
	public boolean instanciaDB() {
		if(strategy.equals("create")) {
			this.dBservice.instanciaDB();
		}
		return false;
	}
}
