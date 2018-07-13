package bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class Cerc {

	@Autowired
	private Punct p;
	
	public Cerc() {
		System.out.println("Constructor: " + p);
	}
	
	@PostConstruct
	public void init () {
		System.out.println("@PostConstruct: " + p);
	}
	
}
