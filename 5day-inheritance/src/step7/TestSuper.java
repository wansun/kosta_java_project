package step7;
class Parent{
	Parent(){
		System.out.println("Parent 객체생성");
	}
}
class Child extends Parent{
	//super() : 부모 생성자를 호출해서 객체 생성하게 한다.
	//super() 는 생성자 첫 실행라인에 위치하도록 규칙이 정해져있다.
	Child(){ //super(); //명시하지 않으면 컴파일시에 자동삽입
		System.out.println("Child 객체생성");
		//super(); // 컴파일 에러 : 셍성자 첫 라인에 위치해야 함
	}
}
public class TestSuper {
	public static void main(String[] args) {
		new Child();
	}
}
