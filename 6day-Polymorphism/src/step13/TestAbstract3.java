package step13;

public class TestAbstract3 {
	public static void main(String[] args) {
		PizzaService service=new PotatoPizzaService();
		service.makePizza();
		/* ���츦 �����
		 * ���� ������ ���
		 * ����
		 * �ڸ���
		 * �����ϴ�
		 */
		PizzaService service2=new SeaFoodPizzaService();
		service2.makePizza();
		/* ���츦 �����
		 * �ػ깰 ������ ���
		 * ����
		 * �ڸ���
		 * �����ϴ�
		 */

	}
}
