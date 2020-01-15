package com.lixin.demo002;

import com.lixin.demo001.Circle;
import com.lixin.demo001.Rectangle;
import com.lixin.demo001.Shape;
import com.lixin.demo001.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
    		return null;
    	}
    	if (shapeType.equalsIgnoreCase("SQUARE")) {
    		return new Square();
    	} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
    		return new Rectangle();
    	} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
    		return new Circle();
    	}
    	return null;
	}

}
