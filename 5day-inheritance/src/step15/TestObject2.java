package step15;

class Employee{
	private String empNo;
	private String name;
	private int salary;
	
	public Employee(String empNo, String name, int salary) {
		super();
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
		
		public String toString() {
			return "empNo:"+empNo+" name:"+name+" salary:"+salary;
		
	}

}

public class TestObject2 {
	public static void main(String[] args) {
		Employee em=new Employee("180129","������",400);
		System.out.println(em); 
		//empNo:180129 name:������ salary:400
		
		Manager m=new Manager("180122","�̻��",500,"�ѹ���");
		System.out.println(m); 
		//empNo:180122 name:�̻�� salary:500 department:�ѹ���
		
		Engineer e=new Engineer("180120","��ȿ��",700,"�ڹ�");
		System.out.println(e); 
		//empNo:180120 name:��ȿ�� salary:700 skill:�ڹ�
	}
}
