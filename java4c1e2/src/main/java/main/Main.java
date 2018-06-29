package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Cerc;
import beans.Punct;

public class Main {

	public static void main(String [] args) {
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("appcontext.xml");
		
		
		Punct p1 = context.getBean(Punct.class);
		Cerc c1 = context.getBean(Cerc.class);
		
		System.out.println(p1.getX()); // 10
		System.out.println(p1.getY()); // 5
		System.out.println(c1.getCentru().getX()); // 10
		System.out.println(c1.getCentru().getY()); // 5
		System.out.println(c1.getRaza()); // 100
	}
}
