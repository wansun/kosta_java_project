package step1;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//�޼��� �������̵�  : �θ� �޼��带 �ڽſ� �°� ����
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
}
class Car{} //Animal ���� ������ ���� Ŭ����
public class TestPolymorphism1 {
	public static void main(String[] args) {
		//�Ϲ������� ��ü�� �ڽ��� Ŭ�������� Ÿ������ �Ѵ�.
		Animal a=new Animal();
		//�Ʒ� �ڵ�� compile error, ��ü�� Ÿ���� �ٸ���
		//Car c=new Animal();
		//�Ʒ��� �����ϴ�. �ڽ� ��ü�� �θ� Ÿ���� ������ ��������
		Animal a2=new Person();
		a.eat();
		a2.eat();//�������̵� �� Person�� eat�޼��尡 ����ȴ�.
	}
}
