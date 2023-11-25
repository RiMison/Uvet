package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.uvet.clinicaVet.model.Projetos;

@Repository
public interface ProjetosRepository extends JpaRepository<Projetos, Long>{

	//Projetos findByEmail(String projetos);

}
