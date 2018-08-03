package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@RequestMapping(method = RequestMethod.POST, path = "/add/product")
	public void addProduct(@RequestBody Product p) {
		System.out.println(p.getName()+ " " + p.getPrice());
		service.addProduct(p);
	}
	@RequestMapping(method = RequestMethod.GET, path = "/product/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return service.getProduct(id);
		
	}
}
