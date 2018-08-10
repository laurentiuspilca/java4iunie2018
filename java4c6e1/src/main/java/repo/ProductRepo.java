package repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entities.Product;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class ProductRepo {

	@PersistenceContext
	private EntityManager em;
	
	public void addProduct(Product p) {
		em.persist(p);
	}
	
	public List<Product> getAllProducts() {
		String sql = "SELECT p FROM Product p";
		TypedQuery<Product> q = em.createQuery(sql, Product.class);
		return q.getResultList();
	}
}
