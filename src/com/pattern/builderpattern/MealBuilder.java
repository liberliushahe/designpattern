package com.pattern.builderpattern;

public class MealBuilder {
	public Meal getVegMeal(){
		Meal m=new Meal();
		m.addItem(new VegBurger());
		m.addItem(new Pepsi());
		return m;
	}
	public Meal getChiMeal(){
		Meal m=new Meal();
		m.addItem(new ChickenBurger());
		m.addItem(new Coke());
		return m;
	}
	


}
