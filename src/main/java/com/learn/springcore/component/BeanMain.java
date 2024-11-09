package com.learn.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.springcore.bean.BeanConfig;
import com.learn.springcore.bean.School;
import com.learn.springcore.bean.Student;

public class BeanMain {
	public static void main(String[] args) {
		
		ApplicationContext context=
				
		 new AnnotationConfigApplicationContext(BeanConfig.class);
		  Student s1= context.getBean("s1",Student.class);
		  System.out.println(s1);
		  
		  School school1=context.getBean("school1",School.class);
		  System.out.println(school1);
		  
		  School school2=context.getBean("school2",School.class);
		  System.out.println(school2);
		  
	
	}

}
