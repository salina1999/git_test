package com.edu.di.car.mycar04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//-------------------------------------------------------------------------------------------------
// �������� ���� ������ ���� - XML ������ ����ϱ�
// �������� �����ؼ� ��ԵǴ� ����?
// �ڵ����� Ÿ�̾� �귣�带 ������ �� ��������/��������� �ʾƵ� 
// XML ���ϸ� �����ϸ� ���α׷��� ���� ����� �ٲ� �� �ִٴ� ���̴�.
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
