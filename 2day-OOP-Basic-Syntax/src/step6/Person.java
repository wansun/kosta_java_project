package step6;

public class Person {
	//인스턴스 변수
	private String name;
	public String getName() {
		return name; //인스턴스 변수에 저장된 정보를 반환
	}
	
	public void setName(String name) { //name은 매개변수
		this.name=name;
		//name=name; //아 라인은 모두 매개변수를 가르킨다
		//this : 현재 객체를 기르키는 자바 키워드
	}
}
