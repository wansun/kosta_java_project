package model;

public class Employee extends Person{
	private String department;
	
	public Employee(String tel, String name, String address, String department) {
		super(tel, name, address);
		this.department=department;
	}
	protected String getInfo() {
		return "전화번호 : "+super.getTel()+"  / 이름 : "+super.getName()+"  / 주소 : "+super.getAddress()+"  / 부서 : "+department;
	}
}
