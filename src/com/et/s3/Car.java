package com.et.s3;

public class Car {
	
	String color;
	String brand;
	int cc;
	
	public Car() {	//기본생성자, (매개변수가 비어있어서)빈생성자	//기본생성자 지우면 다른생성자들이 있으므로 컴파일러가 기본생성자 만들지 않음 그래서 maincar에서 에러
		this("Red");	//자신의 또다른 생성자를 호출
		//생성자 라인의 첫줄에 기술해야함
		/*color = "Red";	//앞으로 습관적으로 빈기본생성자 만들어놓고  시작
		brand = "Audi";
		cc = 3000;*/
	}
	public Car(String color) {	//기본생성자 아님 
		this(color, "Audi");
		/*this.color = color;	//같은color지만 하나는 지역변수 하나는 멤버변수이므로 사용가능  하지만 구분위해 참조변수this사용 this는 생략가능해서 안썼다. 자기객체의 주소값을 나타내는 this
		brand = "Audi";
		cc = 3000;*/
	}
	public Car(String color, String brand) {
		this(color, brand, 3000);
		/*this.color = color;
		this.brand = brand;
		cc= 3000;*/
	}
	public Car(String color, String brand, int cc) {
		this.color = color;
		this.brand = brand;
		this.cc = cc;
	}
	public void info() {
		System.out.println("Color: " + color);
		System.out.println("Brand: " + brand);
		System.out.println("Cc: " + cc);
		this.make(); 							//메서드내에서 또다른 메서드 호출가능
	}
	
	public void make() {
		System.out.println("자동차 제작완료!");
	}

}
