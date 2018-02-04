package step3;
class Employee{
	public void calculateSalary() {
		System.out.println("사원 월급 계산");
	}
}
class Engineer extends Employee{
	@Override
	public void calculateSalary() {
			super.calculateSalary();
			System.out.println("엔지니어 추가수당 계산");
	}
}
class Manager extends Employee{
	@Override
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("매니저 부서운영 특활비 계산");
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
		/*  사원 월급 계산
		 *  엔지니어 추가수당 계산
		 *  매니저 부서운영 특활비 계산
		 */ 
	}
}
