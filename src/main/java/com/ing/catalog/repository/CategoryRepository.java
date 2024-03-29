package com.ing.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.catalog.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	public Category findByCategoryName(String name);

}
