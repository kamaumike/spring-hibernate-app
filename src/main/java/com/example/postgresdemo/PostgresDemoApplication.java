package com.example.postgresdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing annotation enables JPA Auditing
@SpringBootApplication
@EnableJpaAuditing
public class PostgresDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresDemoApplication.class, args);
	}
}
