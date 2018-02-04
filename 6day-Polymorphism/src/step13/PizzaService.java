package step13;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("���츦 �����");
	}
	protected abstract void topping(); //�ڽ�Ŭ������ ������ �����Ѵ�.
	protected void bake() {
		System.out.println("����");
	}
	protected void cutting() {
		System.out.println("�ڸ���");
	}
	protected void box() {
		System.out.println("�����ϴ�");
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
