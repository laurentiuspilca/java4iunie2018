package managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.HelloService;

@Component
public class HelloNameManager {

	@Autowired
	private HelloService helloService;
	
	public void sayHello(String name) {
		System.out.println(helloService.sayHello(name));
	}
}
