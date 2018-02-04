package step9;

public class TestHR {
	public static void main(String[] args) {
		Manager m=new Manager("1811","아이유",800,"영업부");
		System.out.println(m.getEmpNo()); //1811
		System.out.println(m.getName()); //아이유
		System.out.println(m.getSalary()); //800
		System.out.println(m.getDepartment()); //영업부
		System.out.println("*******************************");
		Engineer en=new Engineer("1812","이효리",900,"java");
		System.out.println(en.getEmpNo()); //1812
		System.out.println(en.getName()); //이효리
		System.out.println(en.getSalary()); //900
		System.out.println(en.getSkill()); //java
	}
}
