package com.rsds.java3FilmesOnline.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rsds.java3FilmesOnline.models.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

	public List<Filme> findByNomeAutorContainingIgnoreCase(String name);

	@Query(value = "SELECT obj FROM Filme obj WHERE obj.categoria.id =:id_cat")
	List<Filme> findAllByCategoria(@Param(value = "id_cat") Long id_cat);

}