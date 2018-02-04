package step11;

public class TestDoWhile {
	public static void main(String[] args) {
		// 반복문 do while : 먼저 한번 실행 후 조건검사 
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<0);
	}
}
