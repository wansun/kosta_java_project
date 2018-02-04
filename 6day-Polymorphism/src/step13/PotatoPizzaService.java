package step13;

public class PotatoPizzaService extends PizzaService {
	@Override
	protected void topping() {
		System.out.println("감자 토핑을 얹다");
	}

}
