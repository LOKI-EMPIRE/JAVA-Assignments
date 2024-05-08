package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee obj1 = ctx.getBean("employee",Employee.class);
		obj1.setId(182777);
		obj1.setName("Lokeshwar Prabhaharan");
		Company obj = ctx.getBean("company",Company.class);
		obj.setEmployee(obj1);
		System.out.println(obj.toString());
         	

}

}
