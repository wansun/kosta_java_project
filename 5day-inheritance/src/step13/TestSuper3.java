package step13;
//������ ��Ӱ��谡 ������ extends Object�� ó���ȴ�.
class A{//extends Object
	A(){super();}
}
class B extends A{
	B(){super();}
}
class C extends B{
	C(){super();}
}
public class TestSuper3 {
	public static void main(String[] args) {
		new C();
		/* �� �ڵ尡 ����Ǹ�
		 * ���� ���� Object ��ü ���� ��
		 * A ��ü ���� ��
		 * B ��ü ���� ��
		 * C ��ü �����ȴ�
		 */
	}
}
