package com.excelsoft.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.excelsoft.dao.ProductDao;
import com.excelsoft.entity.Product;
import com.excelsoft.service.ProductService;
@Component
public class ProductServiceImpl implements ProductService{
	//here instead of instantiate ProductDaoImpl use DI (use setter injection)
	@Autowired
	private ProductDao productDao;//= new ProductDaoImpl();
	
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAllProductsServices() {
		return productDao.getAllProducts();
	}
	@Override
	public List<Product> searchProductByRatingsService(float ratings) {
		return null;
	}
	@Override
	public List<Product> searchProductByPriceService(float ratings) {
		return null;
	}
	@Override
	public void addProductService(Product p) {
		
	}

}
