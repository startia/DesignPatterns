package com.lixin.demo004;

/**
 * ����ʵ��Item�ӿڵĳ����࣬�����ṩ��Ĭ�ϵĹ��ܡ�
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