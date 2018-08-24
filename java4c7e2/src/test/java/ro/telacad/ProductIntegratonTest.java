package ro.telacad;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ro.telacad.entities.Product;
import ro.telacad.repo.ProductRepo;
import ro.telacad.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductIntegratonTest {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Before
	public void emptyProductsTableBefore() {
		productRepo.deleteAll();
	}
	
	@After
	public void emptyProductsTableAfter() {
		productRepo.deleteAll();
	}
	
	@Test
	public void saveTenProductTest() {
		productService.addTenProducts();
		assertEquals(10, productRepo.count());
	}
}
