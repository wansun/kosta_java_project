package step10;
class Person{
	Person(){}
	//������ �����ε�
	Person(String name){}
	//������ �����ε�
	Person(String name,int age){}
	public void eat() {
		System.out.println("�Դ�");
	}
	//������ �̸����� �پ��� �Ű������� �����ϱ� ����
	//�����ε� ����� ����Ѵ�
	public void eat(String menu) {
		System.out.println(menu+"�Դ�");
	}
	public void eat(String menu,int count) {
		System.out.println(menu+" "+count+"�κ� �Դ�");
	}
}
public class TestOverloading {
	public static void main(String[] args) {
		//�����ε� �Ǿ� �����Ƿ� eat �޼��常 �˸� ���� �޼��带 �����ϰ� ����� �� �ִ�
		Person p=new Person();
		p.eat();
		p.eat("«��");
		p.eat("������",3);
	}
}
