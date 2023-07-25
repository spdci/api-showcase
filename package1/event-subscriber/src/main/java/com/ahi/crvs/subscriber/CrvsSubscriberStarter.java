package com.ahi.crvs.subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  
public class CrvsSubscriberStarter {

	public static void main() {
		System.out.println("2");
		// SpringApplication.run(CrvsSubscriberStarter.class);
	}
	public static void main(String[] args) {
		System.out.println("1");
		//SpringApplication.run(CrvsSubscriberStarter.class, args);
	}
	
}
