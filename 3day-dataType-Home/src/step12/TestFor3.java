package step12;

public class TestFor3 {
	public static void main(String[] args) {
		System.out.print("������");
		System.out.print(" \t");
		System.out.print("�����");
		System.out.println();
		System.out.print("������");
		System.out.print(" \t");
		System.out.print("�����");
		System.out.println("-----------");
		/*  1	2	3	4	5
		 *  1	2	3	4	5
		 *  1	2	3	4	5
		 */
		for(int j=0;j<3;j++) {
			for(int i=1;i<=5;i++) {
				System.out.print(i+" \t");
			}//for
			System.out.println();
		}//for
	}//main
}





