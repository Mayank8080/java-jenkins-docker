package com.excelsoft.dao;

import java.util.List;

import com.excelsoft.entity.Product;

public interface ProductDao {
List<Product> getAllProducts();
List<Product> searchProductByRatings(float ratings);
List<Product> searchProductByPrice(float ratings);
void addProduct(Product p);
}
