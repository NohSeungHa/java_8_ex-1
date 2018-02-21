package com.et.s2;

import java.util.Scanner;

public class Shef_Source {
	
	public Food_Source makeSource(int select) {
		Food_Source source = new Food_Source();
		switch (select) {
		case 1:
			source.oilName = "Olive";
			source.spiceName = "Hurb";
			break;
		case 2:
			source.oilName = "Milk";
			source.spiceName = "Cheese";
			break;
		default:
			break;
		}
		/*Food_Source source = new Food_Source();
		source.oilName = "Olive";
		source.spiceName = "Hurb";*/
		
		//oilName = "Milk"
		//spiceName = "Cheese"
		
		return source;
	}

}
