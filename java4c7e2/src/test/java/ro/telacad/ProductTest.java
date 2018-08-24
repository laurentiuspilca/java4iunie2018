package ro.telacad;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import ro.telacad.entities.Product;
import ro.telacad.repo.ProductRepo;
import ro.telacad.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
	
	@Autowired
	private ProductService productService;
	
	@MockBean
	private ProductRepo productRepo;
	
	@Test
	public void saveTenProductTest() {
		productService.addTenProducts();
		verify(productRepo,times(10)).save((Product) any());
	}

}
