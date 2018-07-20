package repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import model.Product;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class ProductRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addProduct(Product p) {
		String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
		jdbcTemplate.update(sql, p.getName(), p.getPrice()); // executeUpdate --> update
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void addProductInTransaction(Product p) {
		String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
		jdbcTemplate.update(sql, p.getName(), p.getPrice()); // executeUpdate --> update
		throw new RuntimeException("Bau!");
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Product getSomeProduct() {
		return null;
	}
}
