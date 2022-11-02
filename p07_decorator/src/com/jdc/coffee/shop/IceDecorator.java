package com.jdc.coffee.shop;

public class IceDecorator extends CoffeeMakerDecorator {

	public IceDecorator(Maker maker) {
		super(maker);
	}

	@Override
	public Coffee drip() {
		var coffee = maker.drip();
		coffee.setIce(1);
		return coffee;
	}
}
