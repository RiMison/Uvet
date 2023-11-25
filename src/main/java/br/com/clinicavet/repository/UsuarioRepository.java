package br.com.clinicavet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinicavet.models.UsuarioModels;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModels,Long>{
	UsuarioModels findByemail(String email);
	UsuarioModels findBysenha(String senha);
}
