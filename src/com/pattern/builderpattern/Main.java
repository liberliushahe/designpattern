package com.pattern.builderpattern;

/**
 * ������ģʽ��Builder
 * Pattern��ʹ�ö���򵥵Ķ���һ��һ��������һ�����ӵĶ����������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ�� һ�� Builder
 * ���һ��һ���������յĶ��󡣸� Builder ���Ƕ�������������ġ�
 * ���Ǽ���һ����͵����ҵ���������У�һ�����͵��ײͿ�����һ��������Burger����һ��������Cold
 * drink����������Burger����������ʳ������Veg Burger�����⺺����Chicken Burger���������ǰ���ֽ���С� ������Cold
 * drink�������ǿɿڿ��֣�coke������¿��֣�pepsi����������װ��ƿ���С� ���ǽ�����һ����ʾʳ����Ŀ�����纺������������ Item �ӿں�ʵ��
 * Item �ӿڵ�ʵ���࣬�Լ�һ����ʾʳ���װ�� Packing �ӿں�ʵ�� Packing �ӿڵ�ʵ���࣬�����ǰ���ֽ���У�������װ��ƿ���С�
 * Ȼ�����Ǵ���һ�� Meal �࣬���� Item �� ArrayList ��һ��ͨ����� Item ��������ͬ���͵� Meal �����
 * MealBuilder��Main�����ǵ���ʾ��ʹ�� MealBuilder ������һ�� Meal
 * 
 * @author liushahe
 *
 */
public class Main {

	public static void main(String[] args) {
		MealBuilder b = new MealBuilder();
		Meal m = b.getVegMeal();
		m.getAllPrice();
		m.printInfo();
	}

}
