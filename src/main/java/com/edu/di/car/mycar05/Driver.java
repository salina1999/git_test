package com.edu.di.car.mycar05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//-------------------------------------------------------------------------------------------------
// �������� ���� ������ ���� - ������ ���� ����(XML)���� �Ӽ��� �����Ѵ�.
//-------------------------------------------------------------------------------------------------
public class Driver {

	//-------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-------------------------------------------------------------------------------------------------
	public static void main(String[] args) {

		// ApplicationContext ctx
		// 	= new GenericXmlApplicationContext("com/edu/coffeeshop/coffee5/ApplicationContext.xml");

		// ApplicationContext context
		// 	= new FileSystemXmlApplicationContext("src/main/java/com/edu/di/car/mycar04/appCtx.xml");
		
		// �������� ���� ������ ���� - ������ ���� ����(XML)���� �Ӽ��� �����Ѵ�.
		ApplicationContext context
			= new ClassPathXmlApplicationContext("com/edu/di/car/mycar05/appCtx.xml");
		
		// ����� Bean�� �ҷ��´�.
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
		
	} // End - public static void main(String[] args)

} // End - public class Driver




