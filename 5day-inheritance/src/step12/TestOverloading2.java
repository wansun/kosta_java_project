package step12;

public class TestOverloading2 {
	public static void main(String[] args) {
		Employee e=new Employee("18129","아이유",500); //일반사원
		String info=e.getDetails();
		System.out.println(info); //empNo:18129 name:아이유 salary:500
		Manager m=new Manager("18130","설현",600,"영업부"); //매니저
		String info2=m.getDetails();
		System.out.println(info2); //empNo:18130 name:설현 salary:600 department:영업부
	}
}
