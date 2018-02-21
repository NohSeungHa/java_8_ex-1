package com.et.s3;

public class CarMain {

	public static void main(String[] args) {
		//생성자의 오버로딩(생성자도 메서드이므로 오버로딩 가능)
		Car c = new Car();
		c.info();
		
		Car c2 = new Car("Black");
		c2.info();
	
		Car c3 = new Car("Purple", "Benz");
		c3.info();
	}

}
