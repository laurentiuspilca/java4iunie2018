package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repo.ProductRepo;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public void addProduct(Product p) {
		productRepo.save(p);
	}

	public List<Product> findProductsByName(String name) {
		return productRepo.findProductsByName(name);
	}
}
