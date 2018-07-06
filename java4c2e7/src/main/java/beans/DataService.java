package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataService {

	@Autowired
	@Qualifier("JPA")
	private DataManager dataManager;
	
	public void display() {
		System.out.println(dataManager);
	}
}
