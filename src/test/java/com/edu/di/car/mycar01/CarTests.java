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
		System.out.println("JUnit Test Programe 입니다.!");
	}
	
	//-------------------------------------------------------------------------------------------------
	@Test
	void OneToHundred() {
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			result += i;
		}
		System.out.println("1부터 100까지 더한 값은 " + result + "입니다.");
	}
	
	//-------------------------------------------------------------------------------------------------
	// assertEquals(A, B) : 두 객체(A, B)의 값이 같은지 여부를 알아낸다.
	//-------------------------------------------------------------------------------------------------
	@Test
	void 자동차에_장착된_타이어브랜드_알아내기() {
		Car car = new Car();
		System.out.println(car.getTireBrand());
		
		assertEquals("현재 장착된 타이어는 한국에서 만든 타이어", car.getTireBrand());
	}
	
	
	
	
	
	
} // End - public class CarTests