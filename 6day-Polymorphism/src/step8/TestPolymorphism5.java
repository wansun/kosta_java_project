package step8;

public class TestPolymorphism5 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		Employee e=new Employee("18130","������",300);
		//System.out.println(e);
		Manager m=new Manager("18130","��ȿ��",500,"������");
	    //System.out.println(m);
	    Engineer en=new Engineer("18111","����",600,"�ڹ�",100);
	    //System.out.println(en);
	
		
	    //������ ���� 3600 (salary * 12)
		System.out.println(e.getName()+"����"+service.getAnnualSalary(e));
		//��ȿ�� ���� 6000 (salary * 12)
		System.out.println(m.getName()+"����"+service.getAnnualSalary(m));
		//���� ���� 8400 ((salary + bonus) * 12)
		System.out.println(en.getName()+"����"+service.getAnnualSalary(en));
	}
}
