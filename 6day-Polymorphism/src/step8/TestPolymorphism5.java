package step8;

public class TestPolymorphism5 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		Employee e=new Employee("18130","아이유",300);
		//System.out.println(e);
		Manager m=new Manager("18130","아효리",500,"영업부");
	    //System.out.println(m);
	    Engineer en=new Engineer("18111","고슬링",600,"자바",100);
	    //System.out.println(en);
	
		
	    //아이유 연봉 3600 (salary * 12)
		System.out.println(e.getName()+"연봉"+service.getAnnualSalary(e));
		//이효리 연봉 6000 (salary * 12)
		System.out.println(m.getName()+"연봉"+service.getAnnualSalary(m));
		//고슬링 연봉 8400 ((salary + bonus) * 12)
		System.out.println(en.getName()+"연봉"+service.getAnnualSalary(en));
	}
}
