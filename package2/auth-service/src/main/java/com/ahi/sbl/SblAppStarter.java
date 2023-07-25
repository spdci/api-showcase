package com.ahi.sbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  
public class SblAppStarter {

	public static void main(String[] args) {
		SpringApplication.run(SblAppStarter.class, args);
	}

}
