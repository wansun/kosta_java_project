package model;

public class Teacher extends Person{
	private String subject;
	
	public Teacher(String tel, String name, String address, String subject) {
		super(tel, name, address);
		this.subject=subject;
	}
	protected String getInfo() {
		return "전화번호 : "+super.getTel()+"  / 이름 : "+super.getName()+"  / 주소 : "+super.getAddress()+"  / 부서 : "+subject;
	}
}
