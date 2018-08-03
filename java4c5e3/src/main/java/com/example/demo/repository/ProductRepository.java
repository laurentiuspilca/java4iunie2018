package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public class ProductRepository {

	@Autowired
	private JdbcTemplate jdbc;
	
	public void addProduct(Product p) {
		String sql = "INSERT INTO product VALUES (NULL,?,?)";
		jdbc.update(sql, p.getName(), p.getPrice());
	}
	
	public Product findProduct(int id) {
		String sql = "SELECT *  from product where product.id = ?";
		RowMapper<Product> rm = new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int arg1) throws SQLException {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getDouble("price"));
				return p;
			}
		};
		
		Object[] params = {id};
		return jdbc.queryForObject(sql, params, rm);
	}
}
