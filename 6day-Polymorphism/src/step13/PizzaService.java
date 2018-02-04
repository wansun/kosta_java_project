package step13;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("도우를 만들다");
	}
	protected abstract void topping(); //자식클래스에 구현을 강제한다.
	protected void bake() {
		System.out.println("굽다");
	}
	protected void cutting() {
		System.out.println("자르다");
	}
	protected void box() {
		System.out.println("포장하다");
	}
	// template method
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		box();
	}
}
