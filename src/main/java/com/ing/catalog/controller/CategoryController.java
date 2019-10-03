package com.ing.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.catalog.dto.ProductCategoryResponse;
import com.ing.catalog.service.CategoryService;

@RestController
@RequestMapping("/ing")
public class CategoryController {

	@Autowired
	CategoryService  categoryService;
	
	@GetMapping("/category")
	public ResponseEntity<List<ProductCategoryResponse>> getProductCategories() {
		List<ProductCategoryResponse> response = categoryService.getAllProductCategory();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}

	