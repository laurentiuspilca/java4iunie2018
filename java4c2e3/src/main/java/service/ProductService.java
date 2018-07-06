package service;

import javax.inject.Inject;
import javax.inject.Named;

import repository.ProductRepository;

@Named
public class ProductService {

	@Inject
	private ProductRepository productRepository;
	
	public void addTenProducts() {
		for (int i = 0; i<10; i++) {
			productRepository.addProduct();
		}
	}
}
