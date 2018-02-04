package step7;
//인터페이스 문법 확인 예제
//interface는 객체화 될 수 없다  new Flyer(); //compile error
interface Flyer{
	//static final 상수
	int MAX_COUNT=10; //public static final 생략 가능
	//field(상수,변수)를 선언하면 인터페이스 내에서는
	//무조건 static final 처리가 되므로 인스턴스 변수는 선언이 불가능
	//int money; //compile error
	public void fly(); //abstract 생략 가능
	//public void test() {} //구현부가 있는 메서드 정의할 수 없다
	//java8 (jdk 1.8)에서는 static method와 default method를 지원한다
	//static 메서드 정의 가능
	public static void test() {}
	//default method 정의 가능 : 유지보수성을 위해 java8에서 추가되었음
	public default void testDefault() {}
}
interface Eater{}
class Animal{}
//extends 는 한번만 가능하고 implements 인터페이스는 아래와 같이
//여러개를 implements 할 수 있다
class Bird extends Animal implements Flyer,Eater{
	//상위 인터페이스의 추상 메서드를 구현해야 한다
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}
	
}
class Airplane implements Flyer{
	@Override
	public void fly() {
		System.out.println("비행기가 날다");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		//Flyer 상위 인터페이스 타입으로 하위 객체 참조가능
		//다형성 지원된다.
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
	}
}
