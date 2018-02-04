package step3;
/**
 * static과 non-static 접근 테스트
 * @author rws
 *
 */
class Person{
	static int stAge=1;
	int age=1;
	/*
	 *  test1() 메서드가 실행되기 위해서는 객체 생성을
	 *  전제로 하기 때문에 이미 class loading이 되었으므로
	 *  static stAge와 instance 변수 age 에 모두 접근 가능
	 */
	public void test1() {
		System.out.println(stAge);
		System.out.println(age);
	}
	/*
	 *  static method는 객체 생성없이 클래스 로딩만으로
	 *  실행가능한 메서드이므로 
	 *  같은 static 인 stAge에는 직접 접근이 허용되지만
	 *  age 인스턴스 변수는 객체생성 코드가 없으면 사용이 불가하다.
	 */
	public static void test2() {
		System.out.println(stAge);
		//System.out.println(age);//error
	}
}
public class TestStatic3 {

}
