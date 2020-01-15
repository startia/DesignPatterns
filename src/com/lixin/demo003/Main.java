package com.lixin.demo003;

import com.lixin.demo003.fourth.Singleton;

public class Main {

	public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.call();
	}

}
