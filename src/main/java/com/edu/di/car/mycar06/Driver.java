package com.edu.di.car.mycar06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//-------------------------------------------------------------------------------------------------
// �������� ���� ������ ���� - @AutoWired�� ���� �Ӽ� ����
//-------------------------------------------------------------------------------------------------
public class Driver {

	//-------------------------------------------------------------------------------------------------
	// public static void main(String[] args)
	//-------------------------------------------------------------------------------------------------
	public static void main(String[] args) {

		// ������ ���� ������ �о� ���δ�. => �����̳ʰ� �����ȴ�.
		// �����̳� ���� => ���� ���Ͽ��� <bean>���� ������ ���� Bean���� ��ϵȴ�.
		ApplicationContext ctx
			= new ClassPathXmlApplicationContext("com/edu/di/car/mycar06/appCtx.xml");
		// <bean id="tire"		class="com.edu.di.car.mycar06.KoreaTire"/>
		// KoreaTire tire	= new KoreaTire();
		
		// �ʿ��� Bean�� �����´�.
		Car car = ctx.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
		
	} // End - public static void main(String[] args)

} // End - public class Driver
