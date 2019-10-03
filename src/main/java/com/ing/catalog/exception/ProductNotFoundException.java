package com.ing.catalog.exception;

public class ProductNotFoundException  extends RuntimeException {

	public ProductNotFoundException(String message) {
		super(message);
	}
}
