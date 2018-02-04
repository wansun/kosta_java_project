package step4.access;
//다른 팩키지의 자원을 사용하기 위해 import 선언
// import 단축키 Ctrl + Shift + O(영문)
import step4.bank.MyAccount;

/*
 * 접근 제어자 public 과 private 를 테스트 해본다
 */
public class TestAccessModifier {
	public static void main(String[] args) {
		//m 변수로 객체 생성
		MyAccount m=new MyAccount();
		m.name="아이유"; //public 접근제어자이므로
		// capsulName 은 private 으로 선언되어
		// 다른 팩키지 또는 클래스에서 접근 불가
		// m.calsulName="장기하";
	}
}
