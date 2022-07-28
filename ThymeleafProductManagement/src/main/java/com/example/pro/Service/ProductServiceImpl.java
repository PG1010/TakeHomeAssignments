package com.example.pro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pro.Entity.Product;
import com.example.pro.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepository prorepository;

	public List<Product> findAll() {
		
		return prorepository.findAll();
	}

	public void save(Product p) {
		
		prorepository.save(p);
		
	}

	public Product findById(int id) {

		Optional<Product> p = prorepository.findById(id);
		Product product = null;
		if (p.isPresent())
			product = p.get();
		return product;
	}


	public void deleteById(int id) {

		prorepository.deleteById(id);
	}

}
