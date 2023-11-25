package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.NotificacaoModels;
@Repository
public interface NotificacaoRepository extends JpaRepository<NotificacaoModels, Long>{

}
