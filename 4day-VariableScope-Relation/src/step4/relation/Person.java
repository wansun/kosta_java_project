package step4.relation;

public class Person {
	private String name;
	private SmartPhone smartPhone;
	
	public Person(String name, SmartPhone smartPhone) {
		this.name=name;
		this.smartPhone=smartPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SmartPhone getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
}
