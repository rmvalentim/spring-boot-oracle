package br.com.rafaelvalentim.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelvalentim.webapp.entity.UsuarioEntity;
 
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
 
	UsuarioEntity findByLogin(String login);
 
}