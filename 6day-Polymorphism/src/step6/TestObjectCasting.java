package step6;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
	public void sleep() {
		System.out.println("�ڴ�");
	}
}
class Person extends Animal{
	@Override //�������̵� ���� üũ ������̼�
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
	public void study() { //Person�� �޼���
		System.out.println("����� �����ϴ�");
	}
}
public class TestObjectCasting {
	public static void main(String[] args) {
		//�ڽ� ��ü�� �θ� Ÿ���� ������ �����ϸ�
		Animal a=new Person();
		//��ӹ��� �θ� �޼��� ȣ��
		a.sleep();
		//�������̵� �� �޼��� ȣ��
		a.eat();
		//�ڽ��� �������� ���(���� �Ǵ� �޼���)�� ���ٺҰ�
		//Person ��ü������ a ���� Ÿ���� Animal�̹Ƿ� ������ ����
		//a.study();
		//�ڽ��� �������� ����� �����ϱ� ���ؼ���
		// a ������ �ڽ� Ÿ������ ĳ�����ϸ� �ȴ�.
		((Person)a).study();
	}
}
