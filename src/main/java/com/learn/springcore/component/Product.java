package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component       
public class Product {
	@Value("101")
	       private int id;
	@Value("Laptop")
	       private String name;
	@Value("5000")
	       private int price;
	
	public Product(int id, String name, int price, com.learn.springcore.component.category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public category getCategory() {
		return category;
	}
	// @Autowired // setter injection
	public void setCategory(category category) {
		System.out.println("Setter method");
		this.category = category;
	}
	//@Autowired
	private category category;// field level injection 
	
	
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
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
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(int id, String name, int price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		@Autowired
		public Product(com.learn.springcore.component.category category) {
			super();
			System.out.println("Constructor");
			this.category = category;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

}
