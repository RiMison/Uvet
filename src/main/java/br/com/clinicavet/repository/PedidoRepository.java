package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.PedidoModels;
@Repository
public interface PedidoRepository extends JpaRepository<PedidoModels, Long>{

}
