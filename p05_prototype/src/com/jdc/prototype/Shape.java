package com.jdc.prototype;

public abstract class Shape {
	
	protected String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public Shape(Shape shape) {
		this.name = shape.name;
	}

	public abstract void draw();
	public abstract Shape copy();
}
