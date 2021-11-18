package com.example.demo.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public ArrayList<Product> getProducts() {
		return (ArrayList<Product>) productRepository.findAll();
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	
}
