package com.practise.stream;

import java.util.List;

public class Product {

	int id;
	String name;
	float price;
	List<Integer> prices;
	Integer hashKey;

	public Product(int id, String name, float price,Integer hashKey) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.hashKey=hashKey;
	}
	
	public Product(int id, String name, float price,List prices, Integer hashKey) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.prices=prices;
		this.hashKey=hashKey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Integer> getPrices() {
		return prices;
	}

	public void setPrices(List<Integer> prices) {
		this.prices = prices;
	}

	public Integer getHashKey() {
		return hashKey;
	}

	public void setHashKey(Integer hashKey) {
		this.hashKey = hashKey;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", prices=" + prices + ", hashKey="
				+ hashKey + "]";
	}

	
	
}
