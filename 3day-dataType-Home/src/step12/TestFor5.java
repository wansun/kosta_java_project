package step12;

public class TestFor5 {
	// label �̿� 
	public static void main(String[] args) {
		// num �� ���� ���� 8�̸� ��ü for���� �ߴ��Ѵ� 
		int num=8;
		exit: // label ������� �ϴ� �ݺ��� ���� ���� 
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i+j==num) {
					//break; // ���� for���� ����� 
					break exit;//��ü for���� ����� 
				}
				System.out.print(i+j+" \t");
			}//for
			System.out.println(" �ຯ��");
		}//for 
	}//main
}//class



