package com.excelsoft.service;

import java.util.List;

import com.excelsoft.entity.Product;

public interface ProductService {
	List<Product> getAllProductsServices();
	List<Product> searchProductByRatingsService(float ratings);
	List<Product> searchProductByPriceService(float ratings);
	void addProductService(Product p);
}
