package com.lixin.demo004;

/**
 * 事物条目的接口
 * @author edz
 *
 */
public interface Item {

	public String name();
	
	public Packing packing();
	
	public float price();
}
