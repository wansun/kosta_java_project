package step8;
interface A{
	public void testA();
}
//인터페이스끼리는 상속이 가능하다
interface B extends A{
	public void testB();
}
//B interface는 추상메서드 testB() 와 상속받은 testA()가
//있으므로 두 메서드를 모두 구현해야 한다.
class C implements B{

	@Override
	public void testA() {
	}

	@Override
	public void testB() {
	}
	
}
public class TestInterface2 {
	public static void main(String[] args) {
		
	}
}
