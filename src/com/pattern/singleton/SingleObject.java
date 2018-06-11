package com.pattern.singleton;

public class SingleObject {
	private static SingleObject object = new SingleObject();

	// 私有化构造方法
	private SingleObject() {

	}

	public void getInfo() {
		System.out.println("创建单例对象");
	}

	/**
	 * 饿汉模式创建对象 这种方式比较常用，但容易产生垃圾对象。 优点：没有加锁，执行效率会提高。 缺点：类加载时就初始化，浪费内存。 它基于
	 * classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
	 * 在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载， 这时候初始化
	 * instance 显然没有达到 lazy loading 的效果。
	 * 
	 * @return
	 */
	public static SingleObject getInstance() {
		return object;
	}

	/**
	 * 懒汉模式创建对象 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁
	 * synchronized，所以严格意义上它并不算单例模式。 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
	 */
	// public static SingleObject getInstanceByLazy(){
	// if(object==null){
	// object=new SingleObject();
	// }
	// return object;
	// }

}

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
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
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。 getInstance()
 * 的性能对应用程序不是很关键（该方法使用不太频繁）。
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