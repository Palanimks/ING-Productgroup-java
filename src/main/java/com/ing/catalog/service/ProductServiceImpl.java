package com.ing.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ing.catalog.dto.ProductDetailsResponseDTO;
import com.ing.catalog.entity.Product;
import com.ing.catalog.exception.ProductNotFoundException;
import com.ing.catalog.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	

	public ProductDetailsResponseDTO getProductDetails(int productId) {
		Product product = productRepository.findAllByProductId(productId);
		if (product != null) {

			ProductDetailsResponseDTO productDetailsResponseDTO = new ProductDetailsResponseDTO();

			productDetailsResponseDTO.setCharges(product.getCharges());
			productDetailsResponseDTO.setProductDescription(product.getProductDescription());
			productDetailsResponseDTO.setProductId(productId);
			return productDetailsResponseDTO;
		} else {
			throw new ProductNotFoundException("No Products Available");
		}

	}

	

}
