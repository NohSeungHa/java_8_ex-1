package com.et.s2;

import java.util.Scanner;

public class Menu {

	public void order() {
		Scanner sc = new Scanner(System.in);
		Food_Steak fs = new Food_Steak();
		Food_Pasta fp = new Food_Pasta();
		Shef_Steak st = new Shef_Steak();
		Shef_Pasta sp = new Shef_Pasta();
		Bill bill = new Bill();	

		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");
		int select = sc.nextInt();

		if(select<4) {
			fs = st.makeSteak(select);
			bill.billSteak(fs);

		}else {
			fp = sp.makePasta(select-3);
			bill.billPasta(fp);
		}
		/*switch (select) {
		case 1:
			fs = st.makeSteak(select); 
			System.out.println(fs.name);
			System.out.println(fs.price);
			System.out.println(fs.source.oilName);
			System.out.println(fs.source.spiceName);
			break;
		case 2:
			fs = st.makeSteak(select);
			System.out.println(fs.name);
			System.out.println(fs.price);
			System.out.println(fs.source.oilName);
			System.out.println(fs.source.spiceName);
			break;

		case 3:
			fs = st.makeSteak(select);
			System.out.println(fs.name);
			System.out.println(fs.price);
			System.out.println(fs.source.oilName);
			System.out.println(fs.source.spiceName);
			break;

		case 4:
			fp = sp.makePasta(select);
			System.out.println(fp.name);
			System.out.println(fp.price);
			System.out.println(fp.source.oilName);
			System.out.println(fp.source.spiceName);
			break;

		case 5:
			fp = sp.makePasta(select);
			System.out.println(fp.name);
			System.out.println(fp.price);
			System.out.println(fp.source.oilName);
			System.out.println(fp.source.spiceName);
			break;

		case 6:
			fp = sp.makePasta(select);
			System.out.println(fp.name);
			System.out.println(fp.price);
			System.out.println(fp.source.oilName);
			System.out.println(fp.source.spiceName);
			break;

		default:
			break;
		}*/


	}

}
