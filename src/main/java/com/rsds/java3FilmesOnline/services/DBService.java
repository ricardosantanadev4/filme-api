package com.rsds.java3FilmesOnline.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsds.java3FilmesOnline.models.Categoria;
import com.rsds.java3FilmesOnline.models.Filme;
import com.rsds.java3FilmesOnline.repositorys.CategoriaRepository;
import com.rsds.java3FilmesOnline.repositorys.FilmeRepository;

@Service
public class DBService {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	FilmeRepository filmeRepository;

	public void instanciaDB() {

		Categoria categoria1 = new Categoria("Ação", "Filme de Ação");
		Categoria categoria2 = new Categoria("Comédia", "Filme de Comédia");
		Categoria categoria3 = new Categoria("Aventura", "Filme de Aventura");

		Filme filme1 = new Filme("Título Filme1", "Nome_Autor Filme1", "Texto Filme1", "Médio", categoria1);
		Filme filme2 = new Filme("Título Filme2", "Nome_Autor Filme2", "Texto Filme2", "Grande", categoria1);
		Filme filme3 = new Filme("Título Filme3", "Nome_Autor Filme3", "Texto Filme3", "Grande", categoria2);
		Filme filme4 = new Filme("Título Filme4", "Nome_Autor Filme4", "Texto Filme4", "Pequeno", categoria2);
		Filme filme5 = new Filme("Título Filme5", "Nome_Autor Filme5", "Texto Filme5", "Pequeno", categoria3);

		categoria1.getFilmes().addAll(Arrays.asList(filme1, filme2));
		categoria2.getFilmes().addAll(Arrays.asList(filme3, filme4));
		categoria3.getFilmes().addAll(Arrays.asList(filme3));

		this.categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));
		this.filmeRepository.saveAll(Arrays.asList(filme1, filme2, filme3, filme4, filme5));

	}

}