package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
@ComponentScan("service")
public class ProjectConfig {

	@Bean
	public SimpleJaxWsServiceExporter jaxWsExporter() {
		SimpleJaxWsServiceExporter exporter = 
				new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://localhost:8080/services/");
		return exporter;
	}
}
