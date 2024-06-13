package com.jwtAuthentications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JwtSecurtyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurtyApplication.class, args);
	}

}
