package model;

public class Student extends Person{
	private String studentNumber;
	
	public Student(String tel, String name, String address, String studentNumber) {
		super(tel, name, address);
		this.studentNumber=studentNumber;
	}
	protected String getInfo() {
		return "��ȭ��ȣ : "+super.getTel()+"  / �̸� : "+super.getName()+"  / �ּ� : "+super.getAddress()+"  / �μ� : "+studentNumber;
	}
}
