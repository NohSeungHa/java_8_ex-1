package com.et.s1;

public class StudentView {

	//학생들의 정보를 출력하는 역할
	//메서드명 view
	//학생들의 정보를 출력
	public void view(Student[] st) {

		for(int i=0; i<st.length; i++) {
			System.out.println("학생의 이름: " + st[i].name);
			System.out.println("학생의 번호: " + st[i].num);
			System.out.println("학생 국어점수: " + st[i].kor);
			System.out.println("학생 영어점수: " + st[i].eng);
			System.out.println("학생 수학점수: " + st[i].math);
			System.out.println("학생의 총점: " + st[i].total);
			System.out.println("학생의 평균: " + st[i].avg);
			
		}
	}
}
