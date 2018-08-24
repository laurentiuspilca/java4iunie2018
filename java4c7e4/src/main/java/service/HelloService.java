package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService
@Service
public class HelloService {

	@WebMethod
	public String sayHello(@WebParam String name) {
		return "Hello, " + name;
	}
}
