package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.Cerc;
import bean.Punct;

@Configuration
public class ProjectConfig {

	@Bean
	public Punct punct() {
		return new Punct();
	}
	
	@Bean
	public Cerc cerc() {
		return new Cerc();
	}
}
