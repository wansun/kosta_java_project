package step3;
class Employee{
	public void calculateSalary() {
		System.out.println("��� ���� ���");
	}
}
class Engineer extends Employee{
	@Override
	public void calculateSalary() {
			super.calculateSalary();
			System.out.println("�����Ͼ� �߰����� ���");
	}
}
class Manager extends Employee{
	@Override
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("�Ŵ��� �μ�� ƯȰ�� ���");
	}
}
class CompanyService{
	public void printSalary(Employee e) {
		e.calculateSalary();
	}
}
public class TestPolymorphism3 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		service.printSalary(new Manager());
		service.printSalary(new Engineer());
		service.printSalary(new Employee());
		/*  ��� ���� ���
		 *  �����Ͼ� �߰����� ���
		 *  �Ŵ��� �μ�� ƯȰ�� ���
		 */ 
	}
}
