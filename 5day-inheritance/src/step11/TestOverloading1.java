package step11;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Dog extends Animal{}
//Person class���� eat �޼��� �������̵�
class Person extends Animal{
	//��ӹ��� �θ� �޼��带 �����ؼ� ����ϰ��� �Ҷ�
	//�޼��� �������̵� ����� �̿��Ѵ�
	public void eat() {
		System.out.println("������ �̿��Ѵ�");
		super.eat(); //�θ��� eat �޼��� ����
		System.out.println("����Ʈ�� �Դ´�");
	}
}
public class TestOverloading1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat(); // ��ӹ��� �θ� eat ȣ��ȴ�
		Person p=new Person();
		p.eat(); // �������̵��� �ڽ� eat ȣ��ȴ�
	}
}
