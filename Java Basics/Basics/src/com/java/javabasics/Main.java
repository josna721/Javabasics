package com.java.javabasics;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();// DOg is class and dog is a object of the Dog class
		Cat cat= new Cat();
		
dog.name="tommy";//variable
dog.age=3;
dog.bark();
dog.sleep();//method
cat.name="tom";
cat.meow();
		
	}

}
//step-1: object creation of the class using new
//step-2: define variable Ex: age,name etc
//step-3: call the method using the object like meow,bark...
// method end with()
