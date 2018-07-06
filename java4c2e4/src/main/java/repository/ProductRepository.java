package repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	public void addProduct() {
		System.out.println("Adding product");
	}
}
