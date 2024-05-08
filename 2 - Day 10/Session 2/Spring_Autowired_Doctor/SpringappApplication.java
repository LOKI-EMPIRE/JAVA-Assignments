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
		Patient obj1 = ctx.getBean("patient", Patient.class);
		obj1.setId(01);
		obj1.setName("Gokul");
		Doctor obj2 = ctx.getBean("doctor",Doctor.class);
		obj2.setId(001);
		obj2.setName("Loki");
		AppointmentService obj = ctx.getBean("appointmentService",AppointmentService.class);
		obj.setPatient(obj1);
		obj.setDoctor(obj2);
		System.out.println(obj.toString());
       	
}

}
