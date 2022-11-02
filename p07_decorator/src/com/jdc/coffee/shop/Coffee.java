package com.jdc.coffee.shop;

public class Coffee {

	private int coffee;
	private int sugar;
	private int milk;
	private int ice;

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	@Override
	public String toString() {
		return "Coffee [coffee=" + coffee + ", sugar=" + sugar + ", milk=" + milk + ", ice=" + ice + "]";
	}

	
}
