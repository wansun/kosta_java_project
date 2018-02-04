package step6;
class FinalExam{
	final int MAX_PRICE=100;
	public void test() {
		// final 상수이므로 재할당 불가
		//MAX_PRICE=2;
	}
	//final 메서드는 자식 클래스에서 오바이딩 불가
	public final void test2() {}
}
final class Child extends FinalExam{
	//compile error : final method 는 오버라이딩 못함
	//public void test2() {}
}
//final class는 상속할 수 없다
//class SubChild extends Child{}
public class TestFinal {

}
