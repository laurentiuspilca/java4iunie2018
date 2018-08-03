package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public void addProduct(Product p) {
		repo.addProduct(p);
	}
	
	public Product getProduct(int id) {
		return repo.findProduct(id);
	}
}
