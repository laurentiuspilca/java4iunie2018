package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import entities.Product;
import service.ProductService;

public class Main {

	public static void main(String [] args) {
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			Product p = new Product();
			p.setName("Bere");
			p.setPrice(7);
			context.getBean(ProductService.class).addAndGetAllProducts(p);
		}
	}
}
