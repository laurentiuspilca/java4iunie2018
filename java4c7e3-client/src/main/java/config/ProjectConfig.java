package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import service.HelloService;

@Configuration
@ComponentScan("managers")
public class ProjectConfig {

	@Bean
	public RmiProxyFactoryBean myService() {
		RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
		rmiProxy.setServiceUrl("rmi://localhost/helloservice");
		rmiProxy.setServiceInterface(HelloService.class);
		return rmiProxy;
	}

}
