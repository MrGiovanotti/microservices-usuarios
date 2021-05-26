package com.aprendizaje.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUsuariosApplication.class, args);
	}

}
