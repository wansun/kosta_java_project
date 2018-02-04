package step12;

public class TestFor4 {
	/*  2 단부터 9단까지 
	 * 
	 *  2*1=2		2*2=4 ....
	 *  ......
	 *  ..........................9*9=81
	 */
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+i*j+" \t");
			}
			System.out.println();
		}
	}
}





