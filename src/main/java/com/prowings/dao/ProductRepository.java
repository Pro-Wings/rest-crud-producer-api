package com.prowings.dao;

import java.util.List;

import com.prowings.entity.Product;

public interface ProductRepository {

	public List<Product> getAllProductsFromDb();

	public boolean createProduct(Product product);
	
	
}
