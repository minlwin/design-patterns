package com.jdc.coffee.shop;

public class IceDecorator implements Maker {

	private Maker maker;

	public IceDecorator(Maker maker) {
		super();
		this.maker = maker;
	}

	@Override
	public Coffee drip() {
		var coffee = maker.drip();
		coffee.setIce(1);
		return coffee;
	}
}
