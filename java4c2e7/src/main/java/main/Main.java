package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.DataService;
import config.ProjectConfig;

public class Main {

	public static void main(String [] args) {
		try (
		 AnnotationConfigApplicationContext context = 
		 	new AnnotationConfigApplicationContext(ProjectConfig.class)
		) {
			DataService ds = context.getBean(DataService.class);
			ds.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
