package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloService {
	
	@WebMethod
	public String sayHello(@WebParam String name);
}
