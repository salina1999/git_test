package com.edu.di.car.mycar02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//-------------------------------------------------------------------------------------------------
// public class CarTests
//-------------------------------------------------------------------------------------------------
public class CarTests {

	//-------------------------------------------------------------------------------------------------
	@Test
	public void 한국_타이어_장착여부() {
		Tire	tire1	= new KoreaTire();
		Car		car1	= new Car(tire1);
		
		assertEquals("장착된 타이어는 한국에서 만든 타이어", car1.getTireBrand());
	}
	//-------------------------------------------------------------------------------------------------
	@Test
	public void 미국_타이어_장착여부() {
		Tire	tire2	= new AmericaTire();
		Car		car2	= new Car(tire2);
		
		assertEquals("장착된 타이어는 미국에서 만든 타이어", car2.getTireBrand());
	}
	
	
} // End - public class CarTests
