package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.uvet.clinicaVet.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	//Pedido findByEmail(String pedido);

}
