package repository;

import javax.inject.Named;

import org.springframework.context.annotation.Lazy;

@Named
@Lazy
public class ProductRepository {

	public void addProduct() {
		System.out.println("Saving product");
	}
}
