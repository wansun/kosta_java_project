package model;

public class Employee extends Person{
	private String department;
	
	public Employee(String tel, String name, String address, String department) {
		super(tel, name, address);
		this.department=department;
	}
	protected String getInfo() {
		return "��ȭ��ȣ : "+super.getTel()+"  / �̸� : "+super.getName()+"  / �ּ� : "+super.getAddress()+"  / �μ� : "+department;
	}
}
