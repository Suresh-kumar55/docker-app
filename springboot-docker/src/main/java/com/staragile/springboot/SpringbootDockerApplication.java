package com.staragile.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "docker applciation of springboot";
		
	}
	@GetMapping("/mes")
	public String getMes() {
		return "docker will be containerzed application";
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
