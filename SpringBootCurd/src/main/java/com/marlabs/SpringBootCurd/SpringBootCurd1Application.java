package com.marlabs.SpringBootCurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration

@EntityScan("persistence.domain occur")
@EnableJpaRepositories("persistence.repository")
@SpringBootApplication
public class SpringBootCurd1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurd1Application.class, args);
	}

}
