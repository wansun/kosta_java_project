package step1;
class Person{
	int age; //instance variable -> heap 메모리 영역에 저장
	public void test1(int age) { //local variable 이자 매개변수
		System.out.println(age); //지역변수(매개변수) 이기때문에 1이 뜸
		System.out.println(this.age); //인스턴스 변수이기 때문에 기본 초기화되어 0뜸
	}
	public void test2() {
		/*int k;
		System.out.println(k);*/ //compile error, 지역변수는 초기화해야한다.
		int k=0;
		System.out.println(k);
	}
	public void test3(int i) {
		/*if(i>0) {
			int j=7;
		}*/
		//지역변수 j는 선언된 자신의 실행여역{} 내에서만 사용가능
		//System.out.println(i+J); 에러문임
		//아래와 같이 코딩하면 된다.
		int j=0;
		if(i>0) {
			j=7;
		}
		System.out.println(i+j);
	}
	public void test4() {
		int g=1;
		//int h=2;
		test5(g);
	}
	public void test5(int g) {
		System.out.println(g);
		//System.out.println(h); //error : h는 test4 메서도의 지역변수이므로 에러
	}
}
public class TestVariableScope {
	public static void main(String[] args) {
		Person p=new Person();
		p.test1(1);
		p.test3(1);
	}
}



