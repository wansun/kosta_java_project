package step7;
//�������̽� ���� Ȯ�� ����
//interface�� ��üȭ �� �� ����  new Flyer(); //compile error
interface Flyer{
	//static final ���
	int MAX_COUNT=10; //public static final ���� ����
	//field(���,����)�� �����ϸ� �������̽� ��������
	//������ static final ó���� �ǹǷ� �ν��Ͻ� ������ ������ �Ұ���
	//int money; //compile error
	public void fly(); //abstract ���� ����
	//public void test() {} //�����ΰ� �ִ� �޼��� ������ �� ����
	//java8 (jdk 1.8)������ static method�� default method�� �����Ѵ�
	//static �޼��� ���� ����
	public static void test() {}
	//default method ���� ���� : ������������ ���� java8���� �߰��Ǿ���
	public default void testDefault() {}
}
interface Eater{}
class Animal{}
//extends �� �ѹ��� �����ϰ� implements �������̽��� �Ʒ��� ����
//�������� implements �� �� �ִ�
class Bird extends Animal implements Flyer,Eater{
	//���� �������̽��� �߻� �޼��带 �����ؾ� �Ѵ�
	@Override
	public void fly() {
		System.out.println("���� ����");
	}
	
}
class Airplane implements Flyer{
	@Override
	public void fly() {
		System.out.println("����Ⱑ ����");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		//Flyer ���� �������̽� Ÿ������ ���� ��ü ��������
		//������ �����ȴ�.
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
	}
}
