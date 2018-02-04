package step10;
class Person{
	Person(){}
	//생성자 오버로딩
	Person(String name){}
	//생성자 오버로딩
	Person(String name,int age){}
	public void eat() {
		System.out.println("먹다");
	}
	//동일한 이름으로 다양한 매개변수를 정의하기 위해
	//오버로딩 기법을 사용한다
	public void eat(String menu) {
		System.out.println(menu+"먹다");
	}
	public void eat(String menu,int count) {
		System.out.println(menu+" "+count+"인분 먹다");
	}
}
public class TestOverloading {
	public static void main(String[] args) {
		//오버로딩 되어 있으므로 eat 메서드만 알면 여러 메서드를 간편하게 사용할 수 있다
		Person p=new Person();
		p.eat();
		p.eat("짬뽕");
		p.eat("탕수육",3);
	}
}
