package com.arundeep.SpringBasics;

import com.arundeep.cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.arundeep.cdi")
public class SpringCdiApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {
		System.out.println("Starting Spring Application");

		ApplicationContext applicationContext = SpringApplication.run(SpringCdiApplication.class, args);

		CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);

		logger.info("{} - Dao {}",cdiBusiness, cdiBusiness.getCdidao());
	}

}
