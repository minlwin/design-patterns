package com.jdc.coffee.shop;

public class AppMain {

	public static void main(String[] args) {
		
		var pureCoffeeMaker = new CoffeeMaker();
		System.out.println(pureCoffeeMaker.drip());
		
		var blakcCoffeeMaker = new SugarDecorator(pureCoffeeMaker);
		System.out.println(blakcCoffeeMaker.drip());
		
		var iceCoffeeMaker = new IceDecorator(blakcCoffeeMaker);
		System.out.println(iceCoffeeMaker.drip());
		
		var noSugarIceCoffeeMaker = new IceDecorator(pureCoffeeMaker);
		System.out.println(noSugarIceCoffeeMaker.drip());
	}
}
