package repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	public void saveProduct() {
		System.out.println("Product saved!");
	}
}
