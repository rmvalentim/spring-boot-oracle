package br.com.rafaelvalentim.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import br.com.rafaelvalentim.webapp.entity.GrupoEntity;
import br.com.rafaelvalentim.webapp.entity.PermissaoEntity;
 
 
public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
 
	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);
}
