package com.lixin.demo004;

/**
 * @author edz
 *
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}