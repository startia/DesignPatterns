package com.lixin.demo004;

/**
 * @author edz
 *
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}