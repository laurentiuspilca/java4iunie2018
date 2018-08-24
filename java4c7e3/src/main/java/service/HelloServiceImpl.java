package service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
