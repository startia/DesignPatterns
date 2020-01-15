package com.lixin.demo002;

import com.lixin.demo001.Shape;

public class Main {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		
		Color green = colorFactory.getColor("GREEN");
		green.fill();
	}

}
