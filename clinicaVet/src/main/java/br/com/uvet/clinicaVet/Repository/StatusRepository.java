package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uvet.clinicaVet.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
	
	//Status findByEmail(String status);

}