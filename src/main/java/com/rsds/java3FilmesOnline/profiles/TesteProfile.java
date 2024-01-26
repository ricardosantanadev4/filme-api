package com.rsds.java3FilmesOnline.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rsds.java3FilmesOnline.services.DBService;

@Configuration
@Profile("test")
public class TesteProfile {

	@Autowired
	private DBService dbService;
	
	@Bean
	public String instanciaDB() {
		dbService.instanciaDB();
		return null;
	}
}
