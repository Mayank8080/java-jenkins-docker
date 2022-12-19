package com.excelsoft.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.excelsoft.dao.ProductDao;
import com.excelsoft.entity.Product;
@Component
public class ProductDaoImpl  implements ProductDao{

	List<Product> prodList= new ArrayList<>();
	{  //Assume these data u get from the DB.....
		Product p1= new Product(101, "Headphones", 4000, 4.1f);
		Product p2= new Product(102, "Ear Pod", 3500, 4.4f);
		Product p3= new Product(103, "JBL Speaker", 8000, 4.8f);
		Product p4= new Product(104, "Mobile Sansung", 15000, 3.1f);
		Product p5= new Product(105, "Dell Laptop", 50000, 4.2f);
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
	}
	@Override
	public List<Product> getAllProducts() {
		return prodList;
	}
	@Override
	public List<Product> searchProductByRatings(float ratings) {
		//write the logic here
		return null;
	}
	@Override
	public List<Product> searchProductByPrice(float ratings) {
		//write the logic here
		return null;
	}

	public void addProduct(Product p) {
		//write the logic here , just add in the list

	}

}
