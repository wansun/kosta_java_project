package step7;

public class Person extends Animal{
	@Override
	public void play() {
		System.out.println("사람이 데이트하며 놀다");
	}
	public void ticketing() {
		System.out.println("사람이 티켓을 구매하다");
	}
}
