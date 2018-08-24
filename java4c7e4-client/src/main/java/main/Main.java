package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import service.NameHelloService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
			= new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		context.getBean(NameHelloService.class).sayHello("John");
	}
}
