package com.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject o=  SingleObject.getInstance();
		SingleObject o1=  SingleObject.getInstance();
		o.getInfo();
		if(o==o1){
			System.out.println("ͬһ������");
		}else{
			System.out.println("����ͬһ������");
		}
	}

}
