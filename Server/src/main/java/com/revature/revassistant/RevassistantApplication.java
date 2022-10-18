package com.revature.revassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.revature.revassistant.controllers",
		"com.revature.revassistant.repositories",
		"com.revature.revassistant.services"
})
public class RevassistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevassistantApplication.class, args);
	}

}
