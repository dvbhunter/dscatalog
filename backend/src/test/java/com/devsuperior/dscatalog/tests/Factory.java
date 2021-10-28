package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good phone", 1280.0,
				"https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/17-big.jpg",
				Instant.parse("2020-07-14T10:00:00Z"));
		product.getCategories().add(new Category(2L, "Electronics"));
		return product;
	}

	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());

	}
	
	public static Category createCategory() {
		return new Category(2L, "Electronics");
	}
}
