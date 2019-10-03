package com.ing.catalog.service;



import com.ing.catalog.dto.ProductDetailsResponseDTO;



public interface ProductService {

	//List<ProductResponseDto> getAllProducts(int categoryId);

	ProductDetailsResponseDTO getProductDetails(int productId);

}
