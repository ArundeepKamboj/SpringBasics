package com.arundeep.SpringBasics;

import com.arundeep.SpringBasics.basic.BinarySearchImpl;
import com.arundeep.SpringBasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringScopeApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {
		System.out.println("Starting Spring Application");

		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		logger.info("{}",personDAO.getJdbcConnection());

		logger.info("{}",personDAO1);
		logger.info("{}",personDAO1.getJdbcConnection());
	}

}
