package com.et.s2;

import javax.sound.midi.Patch;

public class Food_Main {

	public static void main(String[] args) {

		Menu menu = new Menu();
		System.out.println("메뉴를 선택하세요.");
		menu.order();
		/*Food_Steak steak = new Food_Steak();
		Shef_Steak ss = new Shef_Steak();
		steak = ss.makeSteak(1);
		
		if(steak != null) {
			System.out.println(steak.name);
			System.out.println(steak.price);
			System.out.println(steak.source.oilName);
			System.out.println(steak.source.spiceName);
		}
		Shef_Source s = new Shef_Source();
		Food_Source source = s.makeSource(1);
		if(source != null) {

			System.out.println(source.oilName);
			System.out.println(source.spiceName);
		}
		
		Shef_Pasta sp = new Shef_Pasta();
		Food_Pasta pasta = sp.makePasta(1);
		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilName);
		System.out.println(pasta.source.spiceName);
		pasta.name = steak.name;	같은 String타입이라 가능
		pasta.price = steak.price;	같은 int타입이라 가능
		pasta = steak;				같은클래스타입이 아니다.*/
	}
}
