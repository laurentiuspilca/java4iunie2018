package ro.telacad.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.telacad.entities.Product;
import ro.telacad.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public void addTenProducts() {
		Random r = new Random();
		for(int i = 0; i < 10 ; i++) {
			Product p = new Product();
			p.setPrice(r.nextInt(1000));
			productRepo.save(p);
		}
	}

}
