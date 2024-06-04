package com.arundeep.SpringBasics;

import com.arundeep.SpringBasics.basic.BinarySearchImpl;
import com.arundeep.SpringBasics.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//app.properties
@PropertySource("classpath:app.properties")
public class SpringBasicPropertiesApplication {

	public static void main(String[] args) {
		System.out.println("Starting Spring Application");

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicPropertiesApplication.class, args);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

		System.out.println(service.serviceURL());

	}

}
