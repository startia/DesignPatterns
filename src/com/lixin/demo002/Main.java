package com.lixin.demo002;

import com.lixin.demo001.Shape;

public class Main {

	public static void main(String[] args) {
	    // ��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// ��ȡ��״ΪCircle�Ķ���
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		// ��ȡ��״ΪSquare�Ķ���
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		// ��ȡ��״ΪRectangle�Ķ���
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		
		// ��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// ��ȡ��ɫΪRed�Ķ���
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		// ��ȡ��ɫΪBlue�Ķ���
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		
		// ��ȡ��ɫΪGreen�Ķ���
		Color green = colorFactory.getColor("GREEN");
		green.fill();
	}

}
