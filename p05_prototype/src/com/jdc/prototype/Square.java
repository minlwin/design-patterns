package com.jdc.prototype;

public class Square extends Shape{
	
	private double side;
	
	public Square(double side) {
		super("Square");
		this.side = side;
	}

	public Square(Square other) {
		super(other);
		this.side = other.side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing %s with side %f.".formatted(name, side));
	}

	@Override
	public Shape copy() {
		return new Square(this);
	}
	
}
