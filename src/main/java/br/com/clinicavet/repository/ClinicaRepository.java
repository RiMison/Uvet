package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.ClinicaModels;
@Repository
public interface ClinicaRepository extends JpaRepository<ClinicaModels, Long>{

}
