package com.edu.di.car.mycar02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//-------------------------------------------------------------------------------------------------
// public class CarTests
//-------------------------------------------------------------------------------------------------
public class CarTests {

	//-------------------------------------------------------------------------------------------------
	@Test
	public void �ѱ�_Ÿ�̾�_��������() {
		Tire	tire1	= new KoreaTire();
		Car		car1	= new Car(tire1);
		
		assertEquals("������ Ÿ�̾�� �ѱ����� ���� Ÿ�̾�", car1.getTireBrand());
	}
	//-------------------------------------------------------------------------------------------------
	@Test
	public void �̱�_Ÿ�̾�_��������() {
		Tire	tire2	= new AmericaTire();
		Car		car2	= new Car(tire2);
		
		assertEquals("������ Ÿ�̾�� �̱����� ���� Ÿ�̾�", car2.getTireBrand());
	}
	
	
} // End - public class CarTests
