package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String sayHello() {
		return "Hello!";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/find/product")
	public Product findProduct() {
		Product p = new Product();
		p.setName("Cioco");
		p.setPrice(10.2);
		return p;
	}
}
