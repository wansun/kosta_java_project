package step2;
class Person{
	static int money;
	public static void test() {
		System.out.println("Person static test method");
	}
}
public class TestStatic2 {
	public static void main(String[] args) {
		//money에 값을 할당
		//static member variable이므로 클래스명으로 접근
		//즉 별도의 객체 생성 필요없다.
		Person.money=2;
		System.out.println(Person.money);
		//test1() 메서드 호출
		Person.test();
	}
}
