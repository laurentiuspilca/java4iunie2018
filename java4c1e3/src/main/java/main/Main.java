package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Produs;

public class Main {

	public static void main(String [] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("appcontext.xml");
		
		//Persoana p1 = context.getBean(Persoana.class);
		//Persoana p2 = context.getBean(Persoana.class);
		//Persoana p3 = context.getBean(Persoana.class);
		
		Produs p1 = context.getBean(Produs.class);
		Produs p2 = context.getBean(Produs.class);
		Produs p3 = context.getBean(Produs.class);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
