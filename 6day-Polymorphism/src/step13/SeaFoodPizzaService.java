package step13;

public class SeaFoodPizzaService extends PizzaService {
	@Override
	protected void topping() {
		System.out.println("해물 토핑을 얹다");
	}

}
