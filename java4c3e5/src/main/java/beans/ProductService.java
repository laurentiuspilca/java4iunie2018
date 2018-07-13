package beans;

public class ProductService {

	public void addProduct() {
		System.out.println("Adding product");
		throw new RuntimeException();
	}
}
