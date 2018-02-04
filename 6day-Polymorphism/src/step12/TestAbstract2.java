package step12;
//abstract method
//추상메서드는 구현부가 없다.
//자식 클래스에서 반드시 구현하도록 강제한다
abstract class Parent{
	public void eat() {
		System.out.println("밥 먹다");
	}
	//abstract method는 구현부를 정의할 수 없다
	//목적이 자식에게 구현을 강제하기 위해 명시한다.
	public abstract void study();
}
class Child extends Parent{
    //부모의 abstract method는 반드시 구현해야 한다.
	//만약 구현하지 않으면 자신 또한 abstract class가 되거나
	//아니면 compile error
	@Override
	public void study() {
		System.out.println("자바를 공부하다");
	}
}
public class TestAbstract2 {
	public static void main(String[] args) {
		
	}
}
