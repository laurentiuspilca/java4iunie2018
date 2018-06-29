package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Product;

public class Main {

	public static void main(String [] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("appcontext.xml");
		
		Product p1 = context.getBean(Product.class);
		
		Product p2 = context.getBean(Product.class);
		
		System.out.println(p1.getName() + " " + p1.getPrice());
		System.out.println(p2.getName() + " " + p2.getPrice());
	}
}
