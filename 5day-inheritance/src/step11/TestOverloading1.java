package step11;
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Dog extends Animal{}
//Person class에서 eat 메서드 오버라이딩
class Person extends Animal{
	//상속받은 부모 메서드를 수정해서 사용하고자 할때
	//메서드 오버라이딩 기법을 이용한다
	public void eat() {
		System.out.println("수저를 이용한다");
		super.eat(); //부모의 eat 메서드 재사용
		System.out.println("디저트를 먹는다");
	}
}
public class TestOverloading1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat(); // 상속받은 부모 eat 호출된다
		Person p=new Person();
		p.eat(); // 오버라이딩한 자식 eat 호출된다
	}
}
