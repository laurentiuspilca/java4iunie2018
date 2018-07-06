package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import repository.ProductRepository;
import service.ProductService;

@Configuration
public class ProjectConfig {
	
	@Bean
	public ProductRepository productRepository1() {
		ProductRepository pr = new ProductRepository();
		pr.init("Hello");
		pr.m();
		return pr;
	}
	
	@Bean
	@Primary
	public ProductRepository productRepository2() {
		ProductRepository pr = new ProductRepository();
		pr.init("Hello");
		pr.m();
		return pr;
	}

	@Bean
	@Autowired
	public ProductService productService(ProductRepository pr) {
		return new ProductService(pr);
	}
}
