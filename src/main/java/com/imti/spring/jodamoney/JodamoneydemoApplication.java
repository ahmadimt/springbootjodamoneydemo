package com.imti.spring.jodamoney;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JodamoneydemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JodamoneydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Exchange.convertMoney(Exchange.getExchangeWrapper());
	}

}
