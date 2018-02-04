package step11;
//abstract class : 직접 객체화 될 수 없다. 부모로서의 역할을 한다.
abstract class Animal{
	Animal(){
		System.out.println("Animal 객체 생성");
	}
	public void eat() {
		System.out.println("먹다");
	}
}
class Monkey extends Animal{}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Animal은 abstract로 선언되어 아래와 같이 객체 생성할 수 없다.
		//Animal a=new Animal();
		//아래와 같이 자식 객체가 생성될 때 부모 객체로서는 생성이 된다
		//즉 abstract class는 자식을 위해 존재한다.
		Animal a=new Monkey();
		a.eat();
	}
}
