package com.lixin.demo004;

/**
 * 创建实现Item接口的抽象类，该类提供了默认的功能。
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