package com.jdc.gui;

public abstract class Button extends BaseComponent{

	public Button(String type) {
		super(type);
	}
	
	@Override
	public void draw() {
		super.draw();
		
		System.out.println("Drawing Button");
	}
}
