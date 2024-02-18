package com.rsds.java3FilmesOnline.dtos;

import com.rsds.java3FilmesOnline.models.Categoria;
import com.rsds.java3FilmesOnline.models.Filme;

public class FilmeDTO {

	private Long id;
	private String titulo;
	private String nome_autor;
	private String texto;
	private String tamanho;

	private Categoria categoria;

	public FilmeDTO(Filme filme) {
		this.id = filme.getId();
		this.titulo = filme.getTitulo();
		this.nome_autor = filme.getNome_autor();
		this.texto = filme.getTexto();
		this.tamanho = filme.getTamanho();
		this.categoria = filme.getCategoria();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}