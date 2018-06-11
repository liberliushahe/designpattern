package com.pattern.singleton;

public class SingleObject {
	private static SingleObject object = new SingleObject();

	// ˽�л����췽��
	private SingleObject() {

	}

	public void getInfo() {
		System.out.println("������������");
	}

	/**
	 * ����ģʽ�������� ���ַ�ʽ�Ƚϳ��ã������ײ����������� �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ� ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档 ������
	 * classloder ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣�
	 * �ڵ���ģʽ�д�������ǵ��� getInstance ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ� ��ʱ���ʼ��
	 * instance ��Ȼû�дﵽ lazy loading ��Ч����
	 * 
	 * @return
	 */
	public static SingleObject getInstance() {
		return object;
	}

	/**
	 * ����ģʽ�������� ���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м���
	 * synchronized�������ϸ��������������㵥��ģʽ�� ���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
	 */
	// public static SingleObject getInstanceByLazy(){
	// if(object==null){
	// object=new SingleObject();
	// }
	// return object;
	// }

}

/**
 * ˫����/˫��У������DCL���� double-checked locking ���ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
 * 
 * @author liushahe
 *
 */
class Singleton {
	private volatile static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}

/**
 * ���ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
 * �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ� ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ� getInstance()
 * �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
 * 
 * @author liushahe
 *
 */
class Singleton1 {
	private static Singleton1 instance1;

	private Singleton1() {
	}

	public static synchronized Singleton1 getInstance() {
		if (instance1 == null) {
			instance1 = new Singleton1();
		}
		return instance1;
	}
}