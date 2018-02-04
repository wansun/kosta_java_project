package model;

public class Student extends Person{
	private String studentNumber;
	
	public Student(String tel, String name, String address, String studentNumber) {
		super(tel, name, address);
		this.studentNumber=studentNumber;
	}
	protected String getInfo() {
		return "전화번호 : "+super.getTel()+"  / 이름 : "+super.getName()+"  / 주소 : "+super.getAddress()+"  / 부서 : "+studentNumber;
	}
}
