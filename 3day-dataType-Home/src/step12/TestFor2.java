package step12;

public class TestFor2 {
	public static void main(String[] args) {
		ForLoopService service=new ForLoopService();
		String item="Äªµû¿À";
		int count=15;
		int limit=7;
		service.printInfo(item,count,limit);
		/* Äªµû¿À 1ÀÜ 
		 * Äªµû¿À 2ÀÜ
		 * ..
		 * Äªµû¿À 7ÀÜ
		 */
	}
}
