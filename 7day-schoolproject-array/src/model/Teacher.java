package model;

public class Teacher extends Person{
	private String subject;
	
	public Teacher(String tel, String name, String address, String subject) {
		super(tel, name, address);
		this.subject=subject;
	}
	protected String getInfo() {
		return "��ȭ��ȣ : "+super.getTel()+"  / �̸� : "+super.getName()+"  / �ּ� : "+super.getAddress()+"  / �μ� : "+subject;
	}
}
