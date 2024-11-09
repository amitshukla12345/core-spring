package com.learn.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	 public Student s1()
	 {
		 return new Student(101,"Nisha", null);
	 }
	@Bean
	public School school1()
	{
		return new School(678,"National School");
	}
	@Bean// to create bean 
	public School school2()
	{
		return new School(103,"GSB School");
	}

}
