package com.pattern.factory;
/**
 * 工厂模式实例代码
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
