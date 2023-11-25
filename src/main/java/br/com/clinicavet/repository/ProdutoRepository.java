package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.ProdutoModels;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModels, Long>{

}
