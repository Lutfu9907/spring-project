package com.lutfudolay.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.lutfudolay.configuration.GlobalProperties;

@SpringBootApplication
@EntityScan(basePackages = {"com.lutfudolay"})
@ComponentScan(basePackages = {"com.lutfudolay"})
@EnableJpaRepositories(basePackages = {"com.lutfudolay"})
//@PropertySource(value = "classpath:app.properties")
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
