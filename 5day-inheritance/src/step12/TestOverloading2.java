package step12;

public class TestOverloading2 {
	public static void main(String[] args) {
		Employee e=new Employee("18129","������",500); //�Ϲݻ��
		String info=e.getDetails();
		System.out.println(info); //empNo:18129 name:������ salary:500
		Manager m=new Manager("18130","����",600,"������"); //�Ŵ���
		String info2=m.getDetails();
		System.out.println(info2); //empNo:18130 name:���� salary:600 department:������
	}
}
