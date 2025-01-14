package com.example.mysqljpaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MysqlJpaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlJpaApiApplication.class, args);
	}

}
