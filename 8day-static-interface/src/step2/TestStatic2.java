package step2;
class Person{
	static int money;
	public static void test() {
		System.out.println("Person static test method");
	}
}
public class TestStatic2 {
	public static void main(String[] args) {
		//money�� ���� �Ҵ�
		//static member variable�̹Ƿ� Ŭ���������� ����
		//�� ������ ��ü ���� �ʿ����.
		Person.money=2;
		System.out.println(Person.money);
		//test1() �޼��� ȣ��
		Person.test();
	}
}
