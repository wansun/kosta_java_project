package step5;
class Car{
	int count; //heap ������ �Ź� ���Ӱ� �ʱ�ȭ
	static int sCount; // class area ������ �ϳ��� ������ ����
	Car(){
		count++;
		sCount++;
	}
}
public class TestStatic5 {
	// �������� �����غ��� ����
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.count);
		Car c2=new Car();
		System.out.println(c2.count);
		Car c3=new Car();
		System.out.println(c3.count);
		System.out.println(Car.sCount);
	}
	static { // main method ���� �켱�ؼ� ����ȴ�.
		System.out.println("static �ʱ�ȭ ���࿵��");
	}
}
