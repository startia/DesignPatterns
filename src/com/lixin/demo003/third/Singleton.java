package com.lixin.demo003.third;

/**
 * 饿汉式
 * @author edz
 *
 */
public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton () {}
	
	public static Singleton getInstance () {
		return instance;
	}
}
