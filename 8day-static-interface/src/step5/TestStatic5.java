package step5;
class Car{
	int count; //heap 영역에 매번 새롭게 초기화
	static int sCount; // class area 영역에 하나의 공간이 생성
	Car(){
		count++;
		sCount++;
	}
}
public class TestStatic5 {
	// 실행결과를 예상해보는 예제
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.count);
		Car c2=new Car();
		System.out.println(c2.count);
		Car c3=new Car();
		System.out.println(c3.count);
		System.out.println(Car.sCount);
	}
	static { // main method 보다 우선해서 실행된다.
		System.out.println("static 초기화 실행영역");
	}
}
