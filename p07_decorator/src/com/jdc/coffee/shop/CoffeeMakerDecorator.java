package com.jdc.coffee.shop;

public abstract class CoffeeMakerDecorator implements Maker {

	protected Maker maker;

	public CoffeeMakerDecorator(Maker maker) {
		this.maker = maker;
	}

}