package com.rsds.java3FilmesOnline.dtos;

import java.util.ArrayList;
import java.util.List;

import com.rsds.java3FilmesOnline.models.Categoria;
import com.rsds.java3FilmesOnline.models.Filme;

public class CategoriaDTO {

	private Long id;

	private String nome;

	private String descricao;

	private List<Filme> filmes = new ArrayList<>();

	public CategoriaDTO(Categoria categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
		this.descricao = categoria.getDescricao();
		this.filmes = categoria.getFilmes();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

}