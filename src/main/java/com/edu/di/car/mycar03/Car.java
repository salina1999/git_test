package com.edu.di.car.mycar03;

//-------------------------------------------------------------------------------------------------
// ���������� ������ �����ϱ� - �Ӽ��� ���� ������ �����ϱ�
//-------------------------------------------------------------------------------------------------
public class Car {

	Tire	tire;

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "������ Ÿ�̾�� " + tire.getBrand();
	}
	
} // End - public class Car

