package com.lixin.demo003.first;

/**
 * ����ʽ���̲߳���ȫ
 * @author edz
 *
 */
public class Singleton {

	private static Singleton instance;
	
	private Singleton () {}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
