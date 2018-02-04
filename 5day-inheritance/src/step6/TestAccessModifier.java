package step6;

import org.kosta.Bank;

//접근제어자 Protected test
class AccessExam{
	public void test() {
		Bank b=new Bank();
		//Bank와 상속관계에 없다면 public만 접근가능
		b.testPublic();
	}
}
class AccessExam2 extends Bank{
	public void accessTest() {
		testPublic();
		testProtected(); //상속받았으므로 접근가능
	}
}
public class TestAccessModifier {
	public static void main(String[] args) {
		
	}
}
