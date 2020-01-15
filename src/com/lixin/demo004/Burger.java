package com.lixin.demo004;

/**
 * @author edz
 *
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}