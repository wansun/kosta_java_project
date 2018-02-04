package step9;

public class Manager extends Employee{ 
	private String department;
	//생성자를 명시하지 않을 경우 컴파일러가 아래와 같이 기본 생성자를 삽입한다.
	//기본 생성자를 삽입한다.
	//super() : 부모의 매개변수없는 기본 생성자를 호출
	//public Manager(){super();}
	public Manager(String empNo,String name,int salary,String department) {
		//super를 이용해 부모 생성자 호출
		super(empNo,name,salary);
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}

