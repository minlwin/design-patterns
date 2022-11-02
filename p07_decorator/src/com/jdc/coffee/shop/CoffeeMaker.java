package com.jdc.coffee.shop;

public class CoffeeMaker implements Maker {

	@Override
	public Coffee drip() {
		var coffee = new Coffee();
		coffee.setCoffee(1);
		return coffee;
	}
}
