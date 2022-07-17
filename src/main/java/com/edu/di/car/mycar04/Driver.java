package com.edu.di.car.mycar04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//-------------------------------------------------------------------------------------------------
// 스프링을 통한 의존성 주입 - XML 파일을 사용하기
// 스프링을 도입해서 얻게되는 이점?
// 자동차의 타이어 브랜드를 변경할 때 재컴파일/재배포하지 않아도 
// XML 파일만 수정하면 프로그램의 실행 결과를 바꿀 수 있다는 것이다.
//-------------------------------------------------------------------------------------------------
public class Driver {

	//-------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		// ApplicationContext ctx
		// 	= new GenericXmlApplicationContext("com/edu/coffeeshop/coffee5/ApplicationContext.xml");

		ApplicationContext context
			= new FileSystemXmlApplicationContext("src/main/java/com/edu/di/car/mycar04/appCtx.xml");
		
		Car		car		= context.getBean("car",	Car.class);
		//Tire	tire	= context.getBean("tireK",	Tire.class);
		//Tire	tire	= context.getBean("tireE",	Tire.class);
		//Tire	tire	= context.getBean("tireA",	Tire.class);
		
		Tire	tire	= context.getBean("tire",	Tire.class);
		
		car.setTire(tire);
		System.out.println(car.getTireBrand());

	} // End - public static void main(String[] args)

} // End - public class Driver
