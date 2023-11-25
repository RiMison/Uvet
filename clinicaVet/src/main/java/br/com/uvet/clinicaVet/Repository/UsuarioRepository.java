package br.com.uvet.clinicaVet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uvet.clinicaVet.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//Usuario findByEmail(String usuario);

}