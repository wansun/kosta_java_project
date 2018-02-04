package step10;

public class TestSwitch2 {
	public static void main(String[] args) {
		int grade = 10;
		switch (grade) {
		case 1:
			System.out.println("하버드");
			break; // 해당  switch 문을 벗어난다 
		case 2:
			System.out.println("북경대");
			break;
		case 3: case 4: case 5: 
			System.out.println("동경대");
			break;
		default: // 그 외 등급은 
			System.out.println("옥스포드");
		}// switch
	}// main method
}// class





