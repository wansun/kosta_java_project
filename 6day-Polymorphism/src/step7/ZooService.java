package step7;

public class ZooService {
	//Animal �θ� Ÿ������ �����ϸ� �پ��� �ڽ� ��ü�� ó���� �� �ִ�
	public void enter (Animal a) {
		if(a instanceof Person) //Person Ÿ���� ��ü���� Ȯ���Ͽ� �ڽİ�ü �޼��� ticketing()�� ĳ�����Ͽ� ����
			((Person) a).ticketing();
		a.play(); //������ �������̵�� �޼��尡 ����ȴ�.
	}
}
