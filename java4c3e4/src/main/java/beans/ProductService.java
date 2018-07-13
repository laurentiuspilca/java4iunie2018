package beans;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public void addProduct() {
		System.out.println("Adding product");
	}
	
	public void getProduct() {
		System.out.println("Getting product");
	}
}
