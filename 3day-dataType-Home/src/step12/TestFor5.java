package step12;

public class TestFor5 {
	// label 이용 
	public static void main(String[] args) {
		// num 즉 더한 값이 8이면 전체 for문을 중단한다 
		int num=8;
		exit: // label 벗어나고자 하는 반복문 위에 선언 
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i+j==num) {
					//break; // 내부 for문만 벗어난다 
					break exit;//전체 for문을 벗어난다 
				}
				System.out.print(i+j+" \t");
			}//for
			System.out.println(" 행변경");
		}//for 
	}//main
}//class



