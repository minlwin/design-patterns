package com.jdc.gui;

public abstract class BaseComponent implements Component{

	private String type;
	
	public BaseComponent(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}	
	
	@Override
	public void draw() {
		System.out.println("Type Family is %s.".formatted(type));
		System.out.println("Drawing Component");
	}
}
