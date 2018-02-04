package model;

public abstract class Person {
	private String tel;
	private String name;
	private String address;
	
	protected abstract String getInfo();
	
	public Person(String tel, String name, String address) {
		
		this.tel = tel;
		this.name = name;
		this.address = address;
	}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return getInfo();
	}

}
