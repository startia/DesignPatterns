package com.lixin.demo002;

import com.lixin.demo001.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}
