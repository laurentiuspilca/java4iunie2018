package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import repository.ProductRepository;

@Configuration
@ComponentScan("service")
public class ProjectConfig {
	
	@Bean
	public ProductRepository productRepository1() {
		ProductRepository pr = new ProductRepository();
		pr.init("Hello");
		pr.m();
		return pr;
	}
}
