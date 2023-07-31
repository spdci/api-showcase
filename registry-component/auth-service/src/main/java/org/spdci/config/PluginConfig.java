package org.spdci.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PluginConfig {
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
