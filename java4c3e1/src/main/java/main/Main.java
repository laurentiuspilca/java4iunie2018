package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Product;
import config.ProjectConfig;

public class Main {

	public static void main(String [] args) {
		try (AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			Product p = context.getBean(Product.class);
		}
	}
}
