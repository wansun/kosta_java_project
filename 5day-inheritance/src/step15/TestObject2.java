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
		Employee em=new Employee("180129","아이유",400);
		System.out.println(em); 
		//empNo:180129 name:아이유 salary:400
		
		Manager m=new Manager("180122","이상순",500,"총무부");
		System.out.println(m); 
		//empNo:180122 name:이상순 salary:500 department:총무부
		
		Engineer e=new Engineer("180120","이효리",700,"자바");
		System.out.println(e); 
		//empNo:180120 name:이효리 salary:700 skill:자바
	}
}
