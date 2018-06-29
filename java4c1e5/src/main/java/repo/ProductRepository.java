package repo;

import org.springframework.stereotype.Repository;

import entities.Product;

@Repository
public class ProductRepository {

	public Product findProductByName(String name) {
		return new Product();
	}
}
