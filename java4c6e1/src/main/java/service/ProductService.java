package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Product;
import repo.ProductRepo;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> addAndGetAllProducts(Product p) {
		productRepo.addProduct(p);
		return null;//productRepo.getAllProducts();
	}
}
