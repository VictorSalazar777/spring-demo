package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;


@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NonNull
	private String name;

	@Transient
	private ArrayList<ProductPrice> productPrices;

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductPrice> getProductPrices() {
		return this.productPrices;
	}

	public void setProductPrices(ArrayList<ProductPrice> productPrices) {
		this.productPrices = productPrices;
	}

	public ProductPrice addProductPrice(ProductPrice productPrice) {
		getProductPrices().add(productPrice);
		return productPrice;
	}

	public ProductPrice removeProductPrice(ProductPrice productPrice) {
		getProductPrices().remove(productPrice);
		return productPrice;
	}

}