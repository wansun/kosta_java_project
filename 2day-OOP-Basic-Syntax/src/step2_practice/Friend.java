package step2_practice;

public class Friend {
	public void eat() {
		System.out.println("먹다");
	}
	
	public void eat2(String menu) {
		System.out.println(menu + "먹다");
	}
	
	public void eat3(int count) {
		System.out.println(count+"인분 먹다");
	}
	
	public void eat4(String menu,int count) {
		System.out.println(menu+" "+count+"인분 먹다");
	}
	
	public String eat5(String menu,int count) {
		return menu+" "+count+"인분 먹다";
	}
}
