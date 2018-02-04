package step14;
/*
 *  �ڹ� �ֻ��� Ŭ������ java.lang.Object ��
 *  toString �޼��带 �������̵��ϴ� ����
 */
class Person{// extends Object
	private String name;
	private int age;
	public Person(String name, int age) {
		super(); //Object ������ ȣ��
		this.name = name;
		this.age = age;
	}

	//Object class�� toString �޼��带 �������̵��Ͽ�
	//��ü�� �ּҰ� ��� �Ӽ� ������ ��ȯ�ϵ��� �Ѵ�.
	@Override // @ ������̼�, �ǹ��ִ� �ּ�
	// @Override �� �����Ͻ� �������̵� ����üũ
		public String toString() {
			return "name:"+name+" age:"+age;
	}
}
public class TestObject {
	public static void main(String[] args) {
		Person p=new Person("������",24);
		//Person ���� Object�� toString�޼��带 �������̵��Ͽ�
		//�ּҰ� ��� ���� ��ü �Ӽ������� ��ȯ�ȴ�.
		System.out.println(p.toString());
		System.out.println(p.toString());
		Person p2=new Person("������",24);
		System.out.println(p2.toString());
		System.out.println(p);//println �޼��忡�� toString�� ȣ���Ѵ�
		System.out.println(p2);//p2.toString() �� ���� ���
	}
}
