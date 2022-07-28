package com.example.pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pro.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
