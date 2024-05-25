package com.arundeep.SpringBasics;

import com.arundeep.SpringBasics.scope.PersonDAO;
import com.arundeep.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;


@SpringBootApplication
@ComponentScan("com.arundeep.componentscan.componentscan")
@ComponentScans({@ComponentScan("com.arundeep.componentscan.componentscan"),@ComponentScan("com.arundeep.componentscan")})
public class SpringComponentScanApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringComponentScanApplication.class);

	public static void main(String[] args) {
		System.out.println("Starting Spring Application");

		ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		logger.info("{}",componentDAO);
	}

}
