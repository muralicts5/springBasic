package com.example.springBasic.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.springBasic.entity.Bike;
import com.example.springBasic.entity.Engine;

@Configuration
public class BikeConfigurator {

	@Bean
	public Engine engine() {
		Engine engine=new Engine();
		engine.setCc(1000);
		engine.setGear(7);
		return engine;
	}
	
	@Bean
	@Scope("prototype")
	public Bike bike(@Value("${bike.name}") String name, Engine engine) {
		List<String> tyres=new ArrayList<String>();
		tyres.add("front");
		tyres.add("back");
		Bike bike=new Bike(name, engine, tyres);
		return bike;
	}
	
}
