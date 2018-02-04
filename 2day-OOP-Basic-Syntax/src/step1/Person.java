package step1; //팩키지 선언부 : 클래스를 디렉토리별로 분류

//클래스 선언부
//클래스는 객체 생성을 위해 정의 : 건물 설계도, 붕어빵 틀
//public : 접근 제어자의 한 종류, 접근 범위가 가장 넓다.
//         어디서나 접근 가능
//Person : 클래스명, 대문자로 시작, 합성어의 첫글자 대문자
//			ex)MyHouse
public class Person {
	//변수(variable) : 객체의 속성을 저장하는 공간
	//name : 변수명, 소문자로 구성, 합성어일 경우 첫글자 대문자
	//		ex) friendName
	//String : 데이터 타입, 문자열을 저장할 때 사용
	String name;
	//변수(variable) : 객체의 속성을 저장하는 공간
	//int : 데이터 타입, 정수형 정보를 저장할 때 사용
	int age;
	//기능 : 메서드로 표현
	//public 은 접근제어자 (어디서나 접근가능)
	//void 는 리턴값이 없을 때 명시하는 키워드
	//study는 메서드명 (변수명 규칙과 동일)
	// () : 매개변수를 명시하는 영역
	// {} : 메서드 기능을 정의하는 영역
	public void study() {
		System.out.println(age + "세" + name + "공부하다");
	}
}











