package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.uvet.clinicaVet.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	//Categoria findByNome_cat (String nome_cat);
}
