package com.edu.di.car.mycar01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//-------------------------------------------------------------------------------------------------
// JUnit Test
//-------------------------------------------------------------------------------------------------
public class CarTests {

	//-------------------------------------------------------------------------------------------------
	@Test
	void test() {
		System.out.println("JUnit Test Programe �Դϴ�.!");
	}
	
	//-------------------------------------------------------------------------------------------------
	@Test
	void OneToHundred() {
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			result += i;
		}
		System.out.println("1���� 100���� ���� ���� " + result + "�Դϴ�.");
	}
	
	//-------------------------------------------------------------------------------------------------
	// assertEquals(A, B) : �� ��ü(A, B)�� ���� ������ ���θ� �˾Ƴ���.
	//-------------------------------------------------------------------------------------------------
	@Test
	void �ڵ�����_������_Ÿ�̾�귣��_�˾Ƴ���() {
		Car car = new Car();
		System.out.println(car.getTireBrand());
		
		assertEquals("���� ������ Ÿ�̾�� �ѱ����� ���� Ÿ�̾�", car.getTireBrand());
	}
	
	
	
	
	
	
} // End - public class CarTests