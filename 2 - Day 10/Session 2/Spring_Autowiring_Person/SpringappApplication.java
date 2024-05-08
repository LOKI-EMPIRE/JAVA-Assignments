package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringappApplication.class, args);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person obj = ctx.getBean("person",Person.class);
        obj.getAddress().setAddress("Salem");
        obj.setAge(21);
        obj.setName("Loki");
        System.out.println(obj.toString());
    }

}
