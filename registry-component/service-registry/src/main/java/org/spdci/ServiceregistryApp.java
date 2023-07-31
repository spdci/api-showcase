package org.spdci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregistryApp {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistryApp.class, args);
	}

}
