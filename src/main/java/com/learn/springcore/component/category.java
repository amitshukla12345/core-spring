package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class category {
	@Value("3456")
	private int categoryId;
	@Value("3456")
	private String categoryname;
	@Value("electronic")
	private String categorydiscription;
	
	public category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public category(String categorydiscription) {
		super();
		this.categorydiscription = categorydiscription;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydiscription() {
		return categorydiscription;
	}
	public void setCategorydiscription(String categorydiscription) {
		this.categorydiscription = categorydiscription;
	}
	@Override
	public String toString() {
		return "category [categoryId=" + categoryId + ", categoryname=" + categoryname + ", categorydiscription="
				+ categorydiscription + "]";
	}
	

	
}
