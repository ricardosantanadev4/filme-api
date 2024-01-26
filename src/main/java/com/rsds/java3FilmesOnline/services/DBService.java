package com.rsds.java3FilmesOnline.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.rsds.java3FilmesOnline.models.Categoria;
import com.rsds.java3FilmesOnline.models.Filme;
import com.rsds.java3FilmesOnline.repositorys.CategoriaRepository;
import com.rsds.java3FilmesOnline.repositorys.FilmeRepository;

public class DBService {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	FilmeRepository filmeRepository;

	public void instanciaDB() {

		Categoria categoria1 = new Categoria("Nome Cateogira1", "Descrição Categoria1");

		Filme filme1 = new Filme("Título Filme1", "Nome_Autor Filme1", "Texto Filme1", "Médio", categoria1);

		categoria1.getFilmes().add(filme1);

		categoriaRepository.save(categoria1);
		filmeRepository.save(filme1);

	}

}