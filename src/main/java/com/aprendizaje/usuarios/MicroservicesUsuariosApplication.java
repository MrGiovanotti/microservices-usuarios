package com.aprendizaje.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

// Hacemos los siguiente para que Spring boot encuentre las entidades, ya que ya
// no están en el paquete base
@EntityScan({"com.aprendizaje.commons.usuarios.models.entities"})
public class MicroservicesUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUsuariosApplication.class, args);
	}

}
