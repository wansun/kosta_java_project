package step1;

public class TestStatic1 {
	//Object의 member 이므로 객체 생성할 때만 사용가능
	public void test1() {
		System.out.println("non-static method test1");
	}
	public static void test2() {
		System.out.println("static method test2");
	}
	public static void main(String[] args) {
		//test1(); //static method 내부이므로 직접 접근 불가
		//객체생성이 필요하다
		new TestStatic1().test1();
		test2(); //static method 내부에서 static으로 접근은 가능
	}
}
