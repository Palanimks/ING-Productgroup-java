package com.ing.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ing.catalog.dto.ProductDetailsResponseDTO;
import com.ing.catalog.service.ProductService;

@RequestMapping("/ing")
@RestController
public class ProductsController {
	
	@Autowired
	ProductService productService;

	 
	@GetMapping("/product/{productId}")
	public ResponseEntity<ProductDetailsResponseDTO> getProductDetails(@PathVariable int productId) {
	
		ProductDetailsResponseDTO productDetails = productService.getProductDetails(productId);
		return new ResponseEntity<>(productDetails, HttpStatus.OK);

	}
	

}
