package step3.relation;

public class Person {
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * Person use a RentCar
	 * RentCar는 tour시에 일시적으로 사영하면 되므로 지역변수 처리한다.
	 */
	public void tour() {
		RentCar car=new RentCar("벤츠","빨강");
		System.out.println(name + "가 " + car.getColor() + "색 " + car.getModel() + "타고" +" 여행하다");
	}
}
