package step8;
interface A{
	public void testA();
}
//�������̽������� ����� �����ϴ�
interface B extends A{
	public void testB();
}
//B interface�� �߻�޼��� testB() �� ��ӹ��� testA()��
//�����Ƿ� �� �޼��带 ��� �����ؾ� �Ѵ�.
class C implements B{

	@Override
	public void testA() {
	}

	@Override
	public void testB() {
	}
	
}
public class TestInterface2 {
	public static void main(String[] args) {
		
	}
}
