package com.example.springBasic;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.example.springBasic.entity.Bike;

@SpringBootApplication
//@ImportResource("applicationContext.xml")
public class SpringBasicApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBasicApplication.class, args);
		Bike bike=(Bike) context.getBean("bike");
		Bike bike1=(Bike) context.getBean("bike");
		System.out.println(bike1);
		System.out.println(bike);

		bike.drive();
	}

	

		 @Bean
			public CommandLineRunner commandLineRunner(ApplicationContext ctx){
				return (args) -> {
					System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
							Arrays.stream(ctx.getBeanDefinitionNames())
							.sorted()
							.forEach(name->System.out.println(name));
				
				};
		 }
		
}
