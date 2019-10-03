package com.ing.catalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.catalog.dto.ProductCategoryResponse;
import com.ing.catalog.entity.Category;
import com.ing.catalog.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public List<ProductCategoryResponse> getAllProductCategory() {
		
		List<ProductCategoryResponse> listCategoryResponse = new ArrayList<>();
		List<Category> listCategory = categoryRepository.findAll();
		for (Category productCategory : listCategory) {
			ProductCategoryResponse response = new ProductCategoryResponse();
			response.setCategoryId(productCategory.getCategoryId());
			response.setCategoryName(productCategory.getCategoryName());
			
			listCategoryResponse.add(response);
			
		}
		return listCategoryResponse;
	}

}
