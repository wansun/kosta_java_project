package step8;

public class CompanyService {
	public int getAnnualSalary(Employee e) {
		int money=e.getSalary();
		if(e instanceof Engineer)
			money+=((Engineer)e).getBonus();
		return money*12;
	}
}
