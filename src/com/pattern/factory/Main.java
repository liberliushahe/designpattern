package com.pattern.factory;
/**
 * ����ģʽʵ������
 * @author liushahe
 *
 */
public class Main {

	public static void main(String[] args) {

        ShapeFactory factory=new ShapeFactory();
        Shape circle=factory.createShapeByType("CIRCLE");
        circle.draw();
	}

}
