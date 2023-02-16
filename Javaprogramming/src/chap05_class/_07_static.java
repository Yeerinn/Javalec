package chap05_class;

import chap05_class.example.student;

public class _07_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성없이 사용할 수 있는 static 키워드
		//static 멤버변수사용
		System.out.println(student.MAJOR);
		System.out.println(student.school);
		
		//System.out.println(student.sNo); static 키워드로 생성되지 않은 멤버변수는 객체 생성 후 사용 가능

		//static 메소드 호츨
		student.majorInfo();
		student.schoolInfo();
		
		//객체가 생성되지 않은 상태로 호출하여 에러발생
		//student.studentInfo();
		
	}

}
