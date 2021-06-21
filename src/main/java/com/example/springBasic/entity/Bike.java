package com.example.springBasic.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Controller 
public class Bike {

	private String name;

	private Engine engine;
	
	
	private List<String> tyres;
	
	//@Autowired
	public Bike(String name, Engine engine,  List<String> tyres) {
		this.name=name;
		System.out.println("tyres");

		System.out.println(tyres);
		this.engine=engine;
		this.tyres=tyres;
	}
	
	
	
	
	public void drive() {
		engine.start();
	}
	
}
