package com.et.s1;

import java.util.Scanner;

public class StudentService {

	//학생추가 메서드
	//메서드명 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	public Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요.");	//학생수 입력
		int n = sc.nextInt();
		Student [] stu = new Student[n];
		
		for(int i=0; i<stu.length; i++) {
			Student student = new Student();
			System.out.println("학생이름을 입력하세요.");
			student.name = sc.next();
			System.out.println("학생번호를 입력하세요.");
			student.num = sc.nextInt();
			stu[i] = student;

		}
		/*for(int i=0; i<stu.length; i++) {
			stu[i] = new Student();
			System.out.println("학생이름을 입력하세요.");
			stu[i].name = sc.next();
			System.out.println("학생번호를 입력하세요.");
			stu[i].num = sc.nextInt();

		}*/
		return stu;
	}

}
