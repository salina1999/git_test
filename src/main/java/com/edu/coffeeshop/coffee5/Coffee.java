package com.edu.coffeeshop.coffee5;

//-------------------------------------------------------------------------------------------------
// 생성자를 통한 주입(인터페이스 사용)
//-------------------------------------------------------------------------------------------------
public class Coffee {
	
	private Americano americano;
	
	public Coffee(Americano ame) {
		americano = ame;
	}
	
	public void coffeeType() {
		System.out.println(americano.getName());
	}

}
