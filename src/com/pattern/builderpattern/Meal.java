package com.pattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	public List<Item> list=new ArrayList<Item>();
	//增加套餐内容
	public void addItem(Item item){
		list.add(item);
	}
	//计算总价格
	public float getAllPrice(){
		float allprice=0f;
		for(Item item :list){
			allprice+=item.price();
		}
		return allprice;
	}
	// 输出套餐内容
	public void printInfo(){
		for(Item item :list){
			System.out.println(item.name());
			System.out.println(item.price());
			System.out.println(item.packing().pack());
			System.out.println("**************");
		}
	}

}
