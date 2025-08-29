package com.java.Rectangle;

public class Rectangle {
	int width,height;//instance variables belong to class,static var related to obj
	public Rectangle(){//constructor name same as class name
	}
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	public int getWidth(){//for accessing the width,h
		return width;
	}
	public void setWidth(int width){//for modifying w,h
		this.width=width;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		this.height=height;
	}


	public static void main(String[] args) { 
		//creating a obj rectangle and printng its prop

	    Rectangle r = new Rectangle(5,10);
	    System.out.println("Width: " + r.getWidth());
	    System.out.println("Height: " + r.getHeight());
	    System.out.println("Area: " + r.getArea());
	}


	public int getArea(){
		return width*height;//return area
	}
	}

	