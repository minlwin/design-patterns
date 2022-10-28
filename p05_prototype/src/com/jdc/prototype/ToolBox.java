package com.jdc.prototype;

public class ToolBox {

	private Shape triangle;
	private Shape circle;
	private Shape square;
	
	public ToolBox(Triangle triangle, Circle circle, Square square) {
		super();
		this.triangle = triangle;
		this.circle = circle;
		this.square = square;
	}
	
	public Shape getTriangle() {
		return triangle.copy();
	}
	
	public Shape getCircle() {
		return circle.copy();
	}
	
	public Shape getSquare() {
		return square.copy();
	}
	
}
