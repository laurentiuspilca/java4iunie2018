package beans.service;

import beans.repository.ProductRepository;
import summer.annotations.SummerComponent;
import summer.annotations.SummerInject;

@SummerComponent
public class ProductService {

	@SummerInject
	private ProductRepository productRepository;
	
	@SummerInject
	private Long x;
	
	public void addTenProducts() {
		for (int i=0; i<10; i++) {
			productRepository.saveProduct();
		}
	}
}
