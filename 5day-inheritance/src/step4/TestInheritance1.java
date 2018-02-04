package step4;

class Animal{ //부모 클래스 super class
	public void eat() {
		System.out.println("먹다");
	}
}
//Animal을 상속. 즉 Person은 Animal을 확장한다
class Person extends Animal{ //자식 클래스 sub class
	public void study() {
		System.out.println("공부하다");
	}
}
public class TestInheritance1 {
	public static void main(String[] args) {
		Person p=new Person();
		p.study();
		p.eat(); //부모 Animal로부터 상속받있기 때문
	}
}
