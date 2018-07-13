package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {

	public static void main(String [] args) {
		try (
			AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(ProjectConfig.class)
			) {
			
		}
	}
}
