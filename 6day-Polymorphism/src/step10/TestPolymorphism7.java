package step10;

import step7.Animal;
import step7.Monkey;
import step7.Person;
import step7.Tiger;

public class TestPolymorphism7 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		Animal a[]= {new Tiger(),new Person(),new Monkey()};
		service.executeAll(a);
		/*ȣ���̰� ����ϸ� ���
		 * ����� Ƽ���� �����ϴ�
		 * ����� ����Ʈ�ϸ� ���
		 * �����̰� ����Ÿ�� ���
		 */

	}
}
