package step12;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}
	//�޼��� �������̵� : super�� �̿��� �θ� �޼��带 �����Ѵ�
	public String getDetails() {
		return super.getDetails()+" deparment:"+department;
	}
}
