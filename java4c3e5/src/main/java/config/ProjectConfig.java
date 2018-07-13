package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ProductServiceAspect;
import beans.ProductService;

@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	public ProductService productService() {
		return new ProductService();
	}
	
	@Bean
	public ProductServiceAspect productServiceAspect() {
		return new ProductServiceAspect();
	}
}
