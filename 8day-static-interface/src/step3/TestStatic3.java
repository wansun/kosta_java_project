package step3;
/**
 * static�� non-static ���� �׽�Ʈ
 * @author rws
 *
 */
class Person{
	static int stAge=1;
	int age=1;
	/*
	 *  test1() �޼��尡 ����Ǳ� ���ؼ��� ��ü ������
	 *  ������ �ϱ� ������ �̹� class loading�� �Ǿ����Ƿ�
	 *  static stAge�� instance ���� age �� ��� ���� ����
	 */
	public void test1() {
		System.out.println(stAge);
		System.out.println(age);
	}
	/*
	 *  static method�� ��ü �������� Ŭ���� �ε�������
	 *  ���డ���� �޼����̹Ƿ� 
	 *  ���� static �� stAge���� ���� ������ ��������
	 *  age �ν��Ͻ� ������ ��ü���� �ڵ尡 ������ ����� �Ұ��ϴ�.
	 */
	public static void test2() {
		System.out.println(stAge);
		//System.out.println(age);//error
	}
}
public class TestStatic3 {

}
