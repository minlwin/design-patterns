package com.jdc.prototype;

public abstract class Shape {
	
	protected String name;
	
	// Constructor for new object
	public Shape(String name) {
		this.name = name;
	}
	
	// Constructor for copied object
	public Shape(Shape shape) {
		this.name = shape.name;
	}

	public abstract void draw();
	public abstract Shape copy();
}
