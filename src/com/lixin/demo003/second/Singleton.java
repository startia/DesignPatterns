package com.lixin.demo003.second;

/**
 * 懒汉式，线程安全。
 * @author edz
 *
 */
public class Singleton {

	private static Singleton instance;
	
	private Singleton () {}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
