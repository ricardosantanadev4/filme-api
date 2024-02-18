package com.rsds.java3FilmesOnline.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rsds.java3FilmesOnline.services.DBService;

@Configuration
@Profile("test")
public class TesteProfile {

	private final DBService dbService;

	public TesteProfile(DBService dbService) {
		this.dbService = dbService;
	}

	@Bean
	public Boolean instanciaDB() {
		dbService.instanciaDB();
		return null;
	}
}
