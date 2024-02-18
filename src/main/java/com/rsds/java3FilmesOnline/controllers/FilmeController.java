package com.rsds.java3FilmesOnline.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rsds.java3FilmesOnline.dtos.FilmeDTO;
import com.rsds.java3FilmesOnline.services.FilmeService;

@RestController
@RequestMapping("/api/filme")
public class FilmeController {

	private final FilmeService filmeService;

	public FilmeController(FilmeService filmeService) {
		this.filmeService = filmeService;
	}

	@GetMapping
	public List<FilmeDTO> findAll() {
		return this.filmeService.findAll();
	}

	@GetMapping("/{id}")
	public FilmeDTO findByid(@PathVariable Long id) {
		return this.filmeService.findById(id);
	}

	@GetMapping("/searchByAuthorName")
	public List<FilmeDTO> findByAuthorName(@RequestParam String authorName) {
		return this.filmeService.findByAuthorName(authorName);
	}

	@GetMapping("/searchByCategory")
	public List<FilmeDTO> findByCategory(@RequestParam String name) {
		return this.filmeService.findByCategory(name.toLowerCase());
	}

}