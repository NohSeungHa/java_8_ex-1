package com.et.s2;

public class Shef_Steak {

	public Food_Steak makeSteak(int select) {
		Food_Steak steak = new Food_Steak();
		Shef_Source ss = new Shef_Source();
		//1.안심스테이크, 30000원, 1번소스
		//2.등심스테이크, 40000원, 2번소스
		//3.립스테이크,  50000원,  1번소스
		switch (select) {
		case 1:
			steak.name = "안심";
			steak.price = 30000;
			steak.source = ss.makeSource(1);
			break;
		case 2:
			steak.name = "등심";
			steak.price = 40000;
			steak.source = ss.makeSource(2);
			break;
		case 3:
			steak.name = "립";
			steak.price = 50000;
			steak.source = ss.makeSource(1);
			break;
		default:
			break;
		}
		/*Shef_Source s = new Shef_Source();
		Food_Steak steak = new Food_Steak();
		steak.name = "";
		steak.price = 40000;
		steak.source = s.makeSource(1);*/

		return steak;
	}

}
