package com.java.javabasics;

public class Mainc {//polymorphism example
	public static void main(String[] args){
		// Runtime polymorphism
		Animal a;
		
		a=new Dog();
		a.sound();   // Dog Barks
		
		 a = new Cat();  
	        a.sound();      // Cat meows

	        // Compile-time Polymorphism
	        Calculator calc = new Calculator();
	        System.out.println("Sum (int): " + calc.add(5, 10));
	        System.out.println("Sum (double): " + calc.add(5.5, 2.5));
	    }
	
		
		
		
		
		
	}
	 


