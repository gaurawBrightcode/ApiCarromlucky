package com.game.carromlucky;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.game.controller" , "com.game.service"})
@EntityScan("com.game.entity")
@EnableJpaRepositories("com.game.repository")
public class CarromLuckyApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(CarromLuckyApplication.class, args);

	}
	
}
