package com.pattern.proxy;

/**
 * �ڴ���ģʽ��Proxy Pattern���У�һ���������һ����Ĺ��ܡ��������͵����ģʽ���ڽṹ��ģʽ��
 * �ڴ���ģʽ�У����Ǵ����������ж���Ķ����Ա�������ṩ���ܽӿڡ�
 * @author liushahe
 *
 */
public class Main {

	public static void main(String[] args) {
		ProxyImage proxyImage = new ProxyImage("test.jpg");
		proxyImage.display();
	}

}
