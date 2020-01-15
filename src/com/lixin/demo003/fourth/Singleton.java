package com.lixin.demo003.fourth;

/**
 * 双重校验锁
 * @author edz
 *
 */
public class Singleton {

	private volatile static Singleton singleton;
	
	private Singleton () {}
	
	public static Singleton getSingleton () {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public void call() {
		System.out.println("Inside Singleton::call() method.");
	}
}
