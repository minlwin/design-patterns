package com.jdc.prototype;

public class Triangle extends Shape{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super("Triangle");
		this.base = base;
		this.height = height;
	}
	
	public Triangle(Triangle other) {
		super(other);
		this.base = other.base;
		this.height = other.height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing %s with base %f and height %f."
				.formatted(name, base, height));
	}

	@Override
	public Shape copy() {
		return new Triangle(this);
	}
}
