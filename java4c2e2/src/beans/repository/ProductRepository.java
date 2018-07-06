package beans.repository;

import summer.annotations.SummerComponent;

@SummerComponent
public class ProductRepository {

	public void saveProduct() {
		System.out.println("Saving product...");
	}
}
