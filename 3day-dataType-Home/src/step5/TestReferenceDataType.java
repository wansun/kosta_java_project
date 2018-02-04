package step5;

public class TestReferenceDataType {
	public static void main(String[] args) {
		Car car=new Car("소나타");
		System.out.println(car.getModel());
		car.setModel("모닝");
		System.out.println(car.getModel());
		// 하나의 클래스에서 다수의 객체를 생성할 수 있으므로 
		// 객체 생성을 하나 더 해본다 
		Car car2=new Car("벤츠");
		/* 
		 * car 객체 주소값을 
		 * car2 변수에 할당했으므로
		 * car2 변수는 car 객체를 참조하게 된다 
		 */
		car2=car;
		System.out.println(car2.getModel());
	}
}








