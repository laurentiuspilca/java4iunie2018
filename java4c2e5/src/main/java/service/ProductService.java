package service;

import repository.ProductRepository;

public class ProductService {

	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public void addTenProducts() {
		for (int i=0; i<10; i++) {
			productRepository.addProduct();
		}
	}
}
