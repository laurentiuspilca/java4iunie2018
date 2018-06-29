package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Product;
import repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public void processAnyhowAProductByName(String name) {
		Product p = productRepo.findProductByName(name);
		// this is very important stuff
	}
}
