package com.et.s1;

import java.util.Scanner;

public class SchoolController {

	//메서드명은 start 
	//리턴은 없음
	//내용은 1.학생등록 2.성적입력 3.성적조회 4.전체조회 5.프로그램종료

	public void start() {
		Scanner sc = new Scanner(System.in);	//스캐너
		Student s = new Student();				//Student 객체 생
		Student [] st = null;
		boolean check = true;	//전체프로그램 순환변수
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();

		while(check) {
			System.out.println("1.학생등록 2.성적입력 3.성적조회 4.전체조회 5.프로그램종료");	//메뉴출력
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생등록");
				st = ss.addStudent();
				break;
			case 2:
				System.out.println("성적입력");
				break;
			case 3:
				System.out.println("성적조회");
				break;
			case 4:
				System.out.println("전체조회");
				sv.view(st);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				check = !check;
				break;
			default :
				break;
			}
		}
	}
}
