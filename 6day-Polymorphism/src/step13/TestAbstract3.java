package step13;

public class TestAbstract3 {
	public static void main(String[] args) {
		PizzaService service=new PotatoPizzaService();
		service.makePizza();
		/* 도우를 만들다
		 * 감자 토핑을 얹다
		 * 굽다
		 * 자르다
		 * 포장하다
		 */
		PizzaService service2=new SeaFoodPizzaService();
		service2.makePizza();
		/* 도우를 만들다
		 * 해산물 토핑을 얹다
		 * 굽다
		 * 자르다
		 * 포장하다
		 */

	}
}
