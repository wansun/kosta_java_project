package step5.test;

import step5.date.MyDate;

public class TestEncapsulation {
	public static void main(String[] args) {
		// m 변수로 MyDate 객체 생성
		MyDate m=new MyDate();
		// day 에 31 할당
		m.day=32; //잘못된 값을 입력해도 저장된다.
		// day 를 출력
		System.out.println(m.day);
		m.setCapsulDay(32);
		System.out.println(m.getCapsulDay());
		m.setCapsulDay(30);
		System.out.println(m.getCapsulDay());
	}
}
