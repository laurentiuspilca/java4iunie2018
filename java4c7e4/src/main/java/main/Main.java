package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ProjectConfig.class);
	}
}
