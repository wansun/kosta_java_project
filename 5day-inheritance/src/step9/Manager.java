package step9;

public class Manager extends Employee{ 
	private String department;
	//�����ڸ� ������� ���� ��� �����Ϸ��� �Ʒ��� ���� �⺻ �����ڸ� �����Ѵ�.
	//�⺻ �����ڸ� �����Ѵ�.
	//super() : �θ��� �Ű��������� �⺻ �����ڸ� ȣ��
	//public Manager(){super();}
	public Manager(String empNo,String name,int salary,String department) {
		//super�� �̿��� �θ� ������ ȣ��
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

