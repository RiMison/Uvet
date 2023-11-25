package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.CompraModels;
@Repository
public interface CompraRepository extends JpaRepository<CompraModels, Long>{

}
