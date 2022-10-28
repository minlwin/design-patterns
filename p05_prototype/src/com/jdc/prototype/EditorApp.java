package com.jdc.prototype;

public class EditorApp {

	public static void main(String[] args) {
		
		var triangle = new Triangle(20, 10);
		var circle = new Circle(15);
		var square = new Square(20);
		
		var toolBox = new ToolBox(triangle, circle, square);
		
		toolBox.getCircle().draw();
		toolBox.getSquare().draw();
		toolBox.getTriangle().draw();
	}
}
