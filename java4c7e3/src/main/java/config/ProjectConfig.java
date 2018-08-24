package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import service.HelloService;

@Configuration
@ComponentScan("service")
public class ProjectConfig {

	@Bean
	public RmiServiceExporter rmiExporter(HelloService myService) {
		RmiServiceExporter rmiExporter = new RmiServiceExporter();
		rmiExporter.setService(myService);
		rmiExporter.setServiceName("helloservice");
		rmiExporter.setServiceInterface(HelloService.class);
		return rmiExporter;
	}
}
