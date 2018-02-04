package step14;
/*
 *  자바 최상위 클래스인 java.lang.Object 의
 *  toString 메서드를 오버라이딩하는 예제
 */
class Person{// extends Object
	private String name;
	private int age;
	public Person(String name, int age) {
		super(); //Object 생성자 호출
		this.name = name;
		this.age = age;
	}

	//Object class의 toString 메서드를 오버라이딩하여
	//객체의 주소값 대신 속성 정보를 반환하도록 한다.
	@Override // @ 어노테이션, 의미있는 주석
	// @Override 는 컴파일시 오버라이딩 문법체크
		public String toString() {
			return "name:"+name+" age:"+age;
	}
}
public class TestObject {
	public static void main(String[] args) {
		Person p=new Person("아이유",24);
		//Person 에서 Object의 toString메서드를 오버라이딩하여
		//주소값 대신 실제 객체 속성정보가 반환된다.
		System.out.println(p.toString());
		System.out.println(p.toString());
		Person p2=new Person("아이유",24);
		System.out.println(p2.toString());
		System.out.println(p);//println 메서드에서 toString을 호출한다
		System.out.println(p2);//p2.toString() 과 같은 결과
	}
}
