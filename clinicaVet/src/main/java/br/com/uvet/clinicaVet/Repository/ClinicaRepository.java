package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.uvet.clinicaVet.model.Clinica;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Long>{
	
}
