package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Product {
	
	public Product() {
		
		System.out.println("A fost creata o instanta de Product");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean initializat");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean distrus");
	}
}
