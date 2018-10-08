package com.sean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class XproApplication {
	private static Logger logger = LoggerFactory.getLogger(XproApplication.class);

	public static void main(String[] args) {
		logger.info("Spriing Boot Begin......");
		SpringApplication.run(XproApplication.class, args);
		logger.info("Spriing Boot End......");
	}
}
