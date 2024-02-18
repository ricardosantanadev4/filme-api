package com.rsds.java3FilmesOnline.services;

import org.springframework.stereotype.Service;

import com.rsds.java3FilmesOnline.dtos.CategoriaDTO;
import com.rsds.java3FilmesOnline.repositorys.CategoriaRepository;

@Service
public class CategoriaService {

	private final CategoriaRepository categoriaRepository;

	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public CategoriaDTO findByCategoria(String nome) {
		return new CategoriaDTO(this.categoriaRepository.findByNomeContainingIgnoreCase(nome).orElseThrow());
	}

}