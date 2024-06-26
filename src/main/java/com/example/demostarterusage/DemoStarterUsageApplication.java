package com.example.demostarterusage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example", "org.example"})
@SpringBootApplication
public class DemoStarterUsageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStarterUsageApplication.class, args);
	}

}
