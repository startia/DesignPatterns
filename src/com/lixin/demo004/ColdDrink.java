package com.lixin.demo004;

/**
 * ����ʵ��Item�ӿڵĳ����࣬�����ṩ��Ĭ�ϵĹ��ܡ�
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