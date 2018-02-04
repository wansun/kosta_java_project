package step6.relation;

public class TestComposition {
	public static void main(String[] args) {
		// consist of 관계, composition
		Car car=new Car("소나타");
	    System.out.println(car.getModel()); //소나타
	    System.out.println(car.getEngine().getType()); //L4
	    System.out.println(car.getEngine().getDisplacement()); //2000
	}
}
