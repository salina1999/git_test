package com.edu.di.car.mycar01;

public class Car {
	
	Tire tire;
	
	public Car() {
		// �ڵ����� Ÿ�̾ ����(new)�ϴ� �κ��� �������谡 �Ͼ�� �ִ� �κ��̴�.
		// tire = new KoreaTire(); <== Ÿ�̾� ����
		tire = new KoreaTire();
	}

	public String getTireBrand() {
		return "���� ������ Ÿ�̾�� " + tire.getBrand();
	}
}

