package step10;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r=new Random();
		//bound 를 3으로 주면 0~2 사이의 임의의 수가 반환
		System.out.println(r.nextInt(3));
		System.out.println(r.nextInt(3));
		for(int i=0;i<10;i++)
		System.out.println(r.nextInt(3));
	}
}
