package step12;
//abstract method
//�߻�޼���� �����ΰ� ����.
//�ڽ� Ŭ�������� �ݵ�� �����ϵ��� �����Ѵ�
abstract class Parent{
	public void eat() {
		System.out.println("�� �Դ�");
	}
	//abstract method�� �����θ� ������ �� ����
	//������ �ڽĿ��� ������ �����ϱ� ���� ����Ѵ�.
	public abstract void study();
}
class Child extends Parent{
    //�θ��� abstract method�� �ݵ�� �����ؾ� �Ѵ�.
	//���� �������� ������ �ڽ� ���� abstract class�� �ǰų�
	//�ƴϸ� compile error
	@Override
	public void study() {
		System.out.println("�ڹٸ� �����ϴ�");
	}
}
public class TestAbstract2 {
	public static void main(String[] args) {
		
	}
}
