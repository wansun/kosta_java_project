package step12;

public class TestFor2 {
	public static void main(String[] args) {
		ForLoopService service=new ForLoopService();
		String item="Ī����";
		int count=15;
		int limit=7;
		service.printInfo(item,count,limit);
		/* Ī���� 1�� 
		 * Ī���� 2��
		 * ..
		 * Ī���� 7��
		 */
	}
}
