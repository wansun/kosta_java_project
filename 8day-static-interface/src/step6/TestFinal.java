package step6;
class FinalExam{
	final int MAX_PRICE=100;
	public void test() {
		// final ����̹Ƿ� ���Ҵ� �Ұ�
		//MAX_PRICE=2;
	}
	//final �޼���� �ڽ� Ŭ�������� �����̵� �Ұ�
	public final void test2() {}
}
final class Child extends FinalExam{
	//compile error : final method �� �������̵� ����
	//public void test2() {}
}
//final class�� ����� �� ����
//class SubChild extends Child{}
public class TestFinal {

}
