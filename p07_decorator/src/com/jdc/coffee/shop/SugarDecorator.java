package com.jdc.coffee.shop;

public class SugarDecorator implements Maker {

	private Maker maker;

	public SugarDecorator(Maker maker) {
		super();
		this.maker = maker;
	}

	@Override
	public Coffee drip() {
		var coffee = maker.drip();
		coffee.setSugar(1);
		return coffee;
	}

}
