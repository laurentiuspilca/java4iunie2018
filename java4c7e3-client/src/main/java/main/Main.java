package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import managers.HelloNameManager;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		context.getBean(HelloNameManager.class).sayHello("John");
	}
}
