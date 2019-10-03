package com.ing.catalog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.catalog.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	

	Product findAllByProductId(int productId);
	
	//Product findByProductId(int productId);

}
