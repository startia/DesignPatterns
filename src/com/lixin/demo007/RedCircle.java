package com.lixin.demo007;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[ color: red, radius: " + radius + ", x : " + x + ", y : " + y + "]");
	}

}
