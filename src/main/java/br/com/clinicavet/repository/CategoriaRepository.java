package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.CategoriaModels;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModels, Long>{
}
