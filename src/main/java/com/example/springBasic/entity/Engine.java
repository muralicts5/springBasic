package com.example.springBasic.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Service
public class Engine {

	private int cc;
	private int gear;


	
	public void start() {
		System.out.println("trrrrrr");
	}
	
  public void run() {
		System.out.println("sssssss");

	}
	
  public void stop() {
		System.out.println("cccccc");

	}
  
}
