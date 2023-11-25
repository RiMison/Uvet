package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.uvet.clinicaVet.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	//Produto findByEmail(String produto);

}
