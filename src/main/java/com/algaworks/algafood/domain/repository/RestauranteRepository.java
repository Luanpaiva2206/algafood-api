package com.algaworks.algafood.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>, RestauranteRepositoryQueries {

	List<Restaurante> findByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);
	
	//List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinhaId);
	
	//@Query("from Restaurante where nome like %:nome% and cozinha.id = :cozinhaId")
	List<Restaurante> consultarPorNome(String nome, Long cozinhaId);
	
	Optional<Restaurante> findFirstByNomeContaining(String nome);
	List<Restaurante> findByNomeContaining(String nome);
	List<Restaurante> findTop2ByNomeContaining(String nome);
	int countByCozinhaId(Long cozinhaId);
	
}
