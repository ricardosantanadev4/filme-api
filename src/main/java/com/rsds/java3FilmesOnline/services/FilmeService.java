package com.rsds.java3FilmesOnline.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rsds.java3FilmesOnline.dtos.CategoriaDTO;
import com.rsds.java3FilmesOnline.dtos.FilmeDTO;
import com.rsds.java3FilmesOnline.repositorys.FilmeRepository;

@Service
public class FilmeService {

	private final FilmeRepository filmeRepository;
	private final CategoriaService categoriaService;

	public FilmeService(FilmeRepository filmeRepository, CategoriaService categoriaService) {
		this.filmeRepository = filmeRepository;
		this.categoriaService = categoriaService;
	}

	public List<FilmeDTO> findAll() {
		return this.filmeRepository.findAll().stream().map(filme -> new FilmeDTO(filme)).collect(Collectors.toList());
	}

	public FilmeDTO findById(Long id) {
		return new FilmeDTO(this.filmeRepository.findById(id).orElseThrow());
	}

	public List<FilmeDTO> findByAuthorName(String authorName) {
		return this.filmeRepository.findByNomeAutorContainingIgnoreCase(authorName).stream()
				.map(filme -> new FilmeDTO(filme)).collect(Collectors.toList());
	}

	public List<FilmeDTO> findByCategory(String categoria) {
		CategoriaDTO categoriaDTO = categoriaService.findByCategoria(categoria);
		return this.filmeRepository.findAllByCategoria(categoriaDTO.getId()).stream().map(filme -> new FilmeDTO(filme))
				.collect(Collectors.toList());
	}
}