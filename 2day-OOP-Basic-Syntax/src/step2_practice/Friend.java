package step2_practice;

public class Friend {
	public void eat() {
		System.out.println("먹다");
	}
	public void eat2(String menu) {
		System.out.println(menu+"먹다");
	}
	public void eat3(int person) {
		System.out.println(person+"인분 먹다");
	}
	public void eat4(String menu,int person) {
		System.out.println(menu+" "+person+"인분 먹다");
	}
	public String eat5(String menu,int person) {
		return menu+" "+person+"인분 먹다";
	}
}
