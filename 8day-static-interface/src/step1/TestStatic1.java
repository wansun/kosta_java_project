package step1;

public class TestStatic1 {
	//Object�� member �̹Ƿ� ��ü ������ ���� ��밡��
	public void test1() {
		System.out.println("non-static method test1");
	}
	public static void test2() {
		System.out.println("static method test2");
	}
	public static void main(String[] args) {
		//test1(); //static method �����̹Ƿ� ���� ���� �Ұ�
		//��ü������ �ʿ��ϴ�
		new TestStatic1().test1();
		test2(); //static method ���ο��� static���� ������ ����
	}
}
