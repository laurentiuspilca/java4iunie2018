package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void saveTenProducts() {
		for (int i=0; i<10; i++) {
			productRepository.saveProduct();
		}
	}
}
