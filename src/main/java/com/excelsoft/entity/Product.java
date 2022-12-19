package com.excelsoft.entity;

public class Product {
private int prodCode;
private String prodName;
private float price;
private float ratings;

public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int prodCode, String prodName, float price, float ratings) {
	super();
	this.prodCode = prodCode;
	this.prodName = prodName;
	this.price = price;
	this.ratings = ratings;
}

public int getProdCode() {
	return prodCode;
}
public void setProdCode(int prodCode) {
	this.prodCode = prodCode;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}


}
