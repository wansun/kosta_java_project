package step11;
//abstract class : ���� ��üȭ �� �� ����. �θ�μ��� ������ �Ѵ�.
abstract class Animal{
	Animal(){
		System.out.println("Animal ��ü ����");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Monkey extends Animal{}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Animal�� abstract�� ����Ǿ� �Ʒ��� ���� ��ü ������ �� ����.
		//Animal a=new Animal();
		//�Ʒ��� ���� �ڽ� ��ü�� ������ �� �θ� ��ü�μ��� ������ �ȴ�
		//�� abstract class�� �ڽ��� ���� �����Ѵ�.
		Animal a=new Monkey();
		a.eat();
	}
}
