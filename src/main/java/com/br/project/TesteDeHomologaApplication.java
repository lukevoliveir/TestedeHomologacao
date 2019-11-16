package com.br.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching
public class TesteDeHomologaApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TesteDeHomologaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TesteDeHomologaApplication.class, args);
	}

}
