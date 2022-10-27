package com.jdc.gui;

public abstract class Dialog extends BaseComponent{

	public Dialog(String type) {
		super(type);
	}

	@Override
	public void draw() {
		super.draw();
		
		System.out.println("Drawing Dialog");
	}
}
