package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameHelloService {

	@Autowired
	private HelloService helloSerivce;
	
	public void sayHello(String name) {
		System.out.println(helloSerivce.sayHello(name));
	}
}
