package step6;
class OperatorEx{
	public boolean test1() {
		System.out.println("test1");
		return false;
	}
	public boolean test2() {
		System.out.println("test2");
		return true;
	}
}
public class TestOperator2 {
	public static void main(String[] args) {
		// and 와 or 연산자 테스트 
		OperatorEx ex=new OperatorEx();
		/*System.out.println(ex.test1()&ex.test2());
		System.out.println("************");
		System.out.println(ex.test1()&&ex.test2());*/
		System.out.println("************");
		System.out.println(ex.test2()||ex.test1());
	}
}








