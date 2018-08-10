package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductRestController {
	@Autowired
	private ProductService service;
	
	@RequestMapping(path ="/add/product", method=RequestMethod.POST)
	public void addProduct(@RequestBody Product p) {
		service.addProduct(p);
	}

}
