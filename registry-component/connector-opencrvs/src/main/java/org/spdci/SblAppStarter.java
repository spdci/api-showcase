package org.spdci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SblAppStarter {
	public static void main(String[] args) {
		SpringApplication.run(SblAppStarter.class, args);
	}

}
