package step4;

public class TestStatic4 {
	//java api ���� �����ϴ� static field(����� ����)�� method ���
	public static void main(String[] args) {
		// int���� �ִ밪
		// static field�̹Ƿ� Ŭ���������� �����Ѵ�
		System.out.println(Integer.MAX_VALUE);
		String s1="1";
		String s2="2";
		System.out.println(s1+s2);
		//Integer class �� static method�� parseInt() �� �̿��� ���ڿ��� 
		//int ������ ��ȯ
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		System.out.println(num1+num2);
	}
}
