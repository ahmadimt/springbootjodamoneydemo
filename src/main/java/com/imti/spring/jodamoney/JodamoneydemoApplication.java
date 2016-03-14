package com.imti.spring.jodamoney;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.imti.spring.jodamoney.util.ExchangeRate;
import com.imti.spring.jodamoney.util.ExchangeRateReader;

@SpringBootApplication
public class JodamoneydemoApplication implements CommandLineRunner {

	@Value("${exchange.rate.file.name}")
	private String exchangeRateFile;

	public static void main(String[] args) {
		SpringApplication.run(JodamoneydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Map<String, ExchangeRate> rateMap = ExchangeRateReader.getExchangeRateFromCSV(exchangeRateFile);
		Exchange.convertMoney(ExchangeWrapper.getExchangeWrapper(rateMap));
	}

}
