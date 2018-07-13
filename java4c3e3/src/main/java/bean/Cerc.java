package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Cerc {

	
	private final Punct punct;
	
	@Autowired
	public Cerc(Punct punct) {
		this.punct = punct;
	}
}
