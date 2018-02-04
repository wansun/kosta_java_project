package step13;
//별도의 상속관계가 없으면 extends Object로 처리된다.
class A{//extends Object
	A(){super();}
}
class B extends A{
	B(){super();}
}
class C extends B{
	C(){super();}
}
public class TestSuper3 {
	public static void main(String[] args) {
		new C();
		/* 위 코드가 실행되면
		 * 제일 먼저 Object 객체 생성 후
		 * A 객체 생성 후
		 * B 객체 생성 후
		 * C 객체 생성된다
		 */
	}
}
