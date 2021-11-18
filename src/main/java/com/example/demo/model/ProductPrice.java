package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="product_price")
public class ProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NonNull
	private BigDecimal price;

	@NonNull
	@Temporal(TemporalType.DATE)
	@Column(name="price_date")
	private Date priceDate;

	@NonNull
	@ManyToOne
	@JoinColumn(name="product_id", referencedColumnName = "id", 
				foreignKey = @ForeignKey(name = "FK_product_id"))
	private Product product;

	public ProductPrice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(@NonNull Product product) {
		this.product = product;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(@NonNull BigDecimal price) {
		this.price = price;
	}

	public Date getPriceDate() {
		return this.priceDate;
	}

	public void setPriceDate(@NonNull Date priceDate) {
		this.priceDate = priceDate;
	}



}