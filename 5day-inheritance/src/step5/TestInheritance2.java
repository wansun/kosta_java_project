package step5;
class Animal{
	private int age; //private이므로 자식이 상속받더라도 직접 접근 안된다.
	public void eat() {}
	//getter, setter로 간접접근은 가능하다.
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Person extends Animal{
	String name;
	public void study() {
		//age 접근불가 compile error
		//private 접근제어자는 다른 클래스에서 접근불가
		//부모 객체를 상속받더라도 클래스는 다르기 때문
		//System.out.println(age+"세 "+name+" 공부하다");
		//아래와 같이 getter setter로 접근하면 된다
		System.out.println(getAge()+"세 "+name+" 공부하다");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class TestInheritance2 {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("아이유");
		p.setAge(24); //상속받았으므로
		p.study();
		p.eat();//상속받았으므로
	}
}
