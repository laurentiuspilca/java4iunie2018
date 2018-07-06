package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;
	
	public void addTenProducts() {
		for (int i=0; i<10; i++) {
			productRepository.addProduct();
		}
	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
}
