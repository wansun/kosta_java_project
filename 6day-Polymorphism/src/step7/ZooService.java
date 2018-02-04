package step7;

public class ZooService {
	//Animal 부모 타입으로 선언하면 다양한 자식 객체를 처리할 수 있다
	public void enter (Animal a) {
		if(a instanceof Person) //Person 타입의 객체인지 확인하여 자식객체 메서드 ticketing()을 캐스팅하여 실행
			((Person) a).ticketing();
		a.play(); //각자의 오버라이드된 메서드가 실행된다.
	}
}
