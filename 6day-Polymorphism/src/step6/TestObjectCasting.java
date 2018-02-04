package step6;
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
	public void sleep() {
		System.out.println("자다");
	}
}
class Person extends Animal{
	@Override //오버라이드 문법 체크 어노테이션
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
	public void study() { //Person의 메서드
		System.out.println("사람이 공부하다");
	}
}
public class TestObjectCasting {
	public static void main(String[] args) {
		//자식 객체를 부모 타입의 변수로 참조하면
		Animal a=new Person();
		//상속받은 부모 메서드 호출
		a.sleep();
		//오버라이드 된 메서드 호출
		a.eat();
		//자식의 독자적인 멤버(변수 또는 메서드)는 접근불가
		//Person 객체이지만 a 변수 타입은 Animal이므로 컴파일 에러
		//a.study();
		//자식의 독자적인 멤버에 접근하기 위해서는
		// a 변수를 자식 타입으로 캐스팅하면 된다.
		((Person)a).study();
	}
}
