package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Produs;
import config.ProjectConfig;

public class Main {

	public static void main(String [] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(
						ProjectConfig.class);
		
		Produs p = context.getBean(Produs.class);
		
		System.out.println(p);
	}
}
