package step1;

public class TestObject {
	//프로그램을 시작하는 메서드 : 메인 메서드
	public static void main(String[] args) {
		/* Person 클래스를 이용해 Person 객체를 생성해 보자
		 * Person : class 명
		 * p : 변수 (객체 참조)
		 * = : 할당
		 * new : 객체 생성시에 명시하는 자바 키워드
		 * Person() : 생성자 Constructor
		 */
		Person p=new Person();
		//생성한 사람 객체의 이름을 할당
		p.name="아이유";
		//p 사람객체의 이름을 출력
		System.out.println(p.name);
		//p 객체의 age에 25를 할당
		
		//p 객체의 age를 출력
		
		p.age=25;
		System.out.println(p.age);
		// p 사람객체의 study를 호출하여 실행시켜 본다.
		
		p.study();
		
	}
}
