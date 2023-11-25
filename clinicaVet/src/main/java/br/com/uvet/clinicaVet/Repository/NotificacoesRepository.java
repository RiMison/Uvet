package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.uvet.clinicaVet.model.Notificacoes;

@Repository
public interface NotificacoesRepository extends JpaRepository<Notificacoes, Long>{
	
	//Notificacoes findByEmail(String notificacoes);
}
