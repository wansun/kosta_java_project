package step12;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}
	//메서드 오버라이딩 : super를 이용해 부모 메서드를 재사용한다
	public String getDetails() {
		return super.getDetails()+" deparment:"+department;
	}
}
