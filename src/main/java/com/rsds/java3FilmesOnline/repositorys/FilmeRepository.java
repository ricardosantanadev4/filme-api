package com.rsds.java3FilmesOnline.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsds.java3FilmesOnline.models.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
	
}