package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p WHERE p.name LIKE :name")
	public List<Product> findProductsByName(@Param("name") String name);
}
