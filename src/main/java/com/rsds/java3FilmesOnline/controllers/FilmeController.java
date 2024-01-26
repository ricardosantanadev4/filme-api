package com.rsds.java3FilmesOnline.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsds.java3FilmesOnline.models.Filme;
import com.rsds.java3FilmesOnline.repositorys.FilmeRepository;

@RestController
@RequestMapping("/filme")
public class FilmeController {
	@Autowired
	FilmeRepository filmeRepository;

	@GetMapping
	public List<Filme> list() {
		return filmeRepository.findAll();
	}
}