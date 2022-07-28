package com.example.pro.Service;

import java.util.List;

import com.example.pro.Entity.Product;

public interface ProductService {

	public List<Product> findAll();
	
	public void save(Product p);
	
	public Product findById(int id);
	
	public void deleteById(int id);
	
}
