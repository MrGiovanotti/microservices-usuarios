package com.aprendizaje.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.aprendizaje.commons.usuarios.models.entities.Role;
import com.aprendizaje.commons.usuarios.models.entities.Usuario;

/**
 * Esta clase de configuración es para incluir los id cuando hagamos consultas a
 * nuestros endpoints automáticos, es opcional
 * 
 * @author ggranda
 *
 */

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}

}
