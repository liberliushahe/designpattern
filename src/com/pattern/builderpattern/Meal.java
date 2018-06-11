package com.pattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	public List<Item> list=new ArrayList<Item>();
	//�����ײ�����
	public void addItem(Item item){
		list.add(item);
	}
	//�����ܼ۸�
	public float getAllPrice(){
		float allprice=0f;
		for(Item item :list){
			allprice+=item.price();
		}
		return allprice;
	}
	// ����ײ�����
	public void printInfo(){
		for(Item item :list){
			System.out.println(item.name());
			System.out.println(item.price());
			System.out.println(item.packing().pack());
			System.out.println("**************");
		}
	}

}
