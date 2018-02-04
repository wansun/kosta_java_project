package step4;

import java.util.ArrayList;

public class TestCartService {
	public static void main(String[] args) {
		CartService service=new CartService();
		service.addProduct(new Product("참이슬","진로",1000));
		service.addProduct(new Product("새우깡","농심",1200));
		service.addProduct(new Product("족발","오뚜기",14000));
		service.addProduct(new Product("감자깡","농심",1500));
		System.out.println("**장바구니에 있는 상품목록 출력**");
		service.printAll();
		/*int totalPrice=service.getTotalPrice();
		System.out.println("결제총액 : "+totalPrice);
		
		ArrayList<Product> list=service.findProductListByMaker("농심");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i)); //농심 제품의 상품 정보만 출력
*/	}
}
