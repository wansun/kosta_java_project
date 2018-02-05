package step4;

public class TestCartService {
	public static void main(String[] args) {
		CartService service=new CartService();
		service.addProduct(new Product("���̽�","����",1000));
		service.addProduct(new Product("�����","���",1200));
		service.addProduct(new Product("����","���ѱ�",14000));
		service.addProduct(new Product("���ڱ�","���",1500));
		System.out.println("**��ٱ��Ͽ� �ִ� ��ǰ��� ���**");
		service.printAll();
		/*int totalPrice=service.getTotalPrice();
		System.out.println("�����Ѿ� : "+totalPrice);
		
		ArrayList<Product> list=service.findProductListByMaker("���");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i)); //��� ��ǰ�� ��ǰ ������ ���
*/	}
}
