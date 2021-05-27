package com.aprendizaje.usuarios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.aprendizaje.commons.usuarios.models.entities.Usuario;

// A partir de este repositorio creamos automáticamente un CRUD completo.
// Le pasamos el que va a ser el endpoint donde estará todo nuestro CRUD
@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

	// Hacemos esto para incluir este método a las búsquedas con search de
	// nuestros endpoints automáticos. Si no ponemos esto, el endpoint se define con el
	// nombre del método y del parámetro
	// localhost:8090/api/usuarios/usuarios/search/buscar-username?username=ggranda
	@RestResource(path = "buscar-username")
	Usuario findByUsername(@Param(value = "username") String username);

}
