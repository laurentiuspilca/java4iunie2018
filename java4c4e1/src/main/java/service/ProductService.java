package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Product;
import repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public void addTenProducts() {
		for (int i = 1; i <= 10; i++) {
			Product p = new Product();
			p.setName("Product " + i);
			p.setPrice(10);
		
			productRepository.addProduct(p);
		}
		
		Product lastProduct = new Product();
		lastProduct.setName("Last product");
		productRepository.addProductInTransaction(lastProduct);
	}
}
