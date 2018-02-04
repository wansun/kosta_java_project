package step2;
/*
 * 객체 초기화 단계 테스트 예제
 * 1. 인스턴스 변수 기본초기화
 * 2. 인스턴스 변수 명시적 초기화
 * 3. 생성자에 의한 초기화
 */
public class TestObjectinit {
	public static void main(String[] args) {
		Car car=new Car("아우디",100);
		System.out.println(car.getCarNum());
		System.out.println(car.getColor());
		System.out.println(car.getModel());
		System.out.println(car.getPrice());
		System.out.println(car.isFlag());
	}
}
