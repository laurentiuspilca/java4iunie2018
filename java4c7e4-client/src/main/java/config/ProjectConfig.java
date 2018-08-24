package config;

import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import service.HelloService;

@Configuration
@ComponentScan("service")
public class ProjectConfig {

	@Bean
	public JaxWsPortProxyFactoryBean myService() throws Exception {
		JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
		proxy.setWsdlDocumentUrl(new URL("http://localhost:8080/services/HelloService?wsdl"));
		proxy.setServiceName("HelloServiceService");
		proxy.setPortName("HelloServicePort");
		proxy.setServiceInterface(HelloService.class);
		proxy.setNamespaceUri("http://service/");
		return proxy;
	}

}
