package step4;
/*
 *  instanceof : is a ���� ������ true�� ��ȯ
 *  			��ü Ÿ���� ���Ѵ�
 */
class Employee{}
class Engineer extends Employee{}
class Manager extends Employee{}
class Dog{}
public class TestInstanceof {
	public static void main(String[] args) {
		Employee m=new Manager();
		//m�� �����ϴ� ��ü�� Manager �̹Ƿ� true
		System.out.println(m instanceof Manager); //ture
		//m�� �����ϴ� ��ü�� Manager�̰� Employee �ڽ��̹Ƿ� true
		System.out.println(m instanceof Employee);//true
		//������ ����, �񱳺Ұ� (���� �Ұ��� �ִ� ���������� ���ؼ� ������ �ȵȴ�)
		//System.out.println(m instanceof Dog);
		//m�� �����ϴ� ��ü�� Manager �̰� Engineer�� �ƴϹǷ� false
		System.out.println(m instanceof Engineer); //false
	}
}
