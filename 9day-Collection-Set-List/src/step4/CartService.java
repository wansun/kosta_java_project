package step4;

import java.util.ArrayList;

public class CartService {
	private ArrayList<Product> list=new ArrayList<Product>();
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	public int getTotalPrice() {
		int totalPrice=0;
		for(int i=0;i<list.size();i++)
			totalPrice+=list.get(i).getPrice();
		return totalPrice;
	}
	public ArrayList<Product> findProductListByMaker(String maker){
		ArrayList<Product> localList=new ArrayList<Product>();
		for(int i=0;i<list.size();i++)
			if(list.get(i).getMaker().equals(maker)) {
				localList.add(list.get(i));
			}
		return localList;
	}
	
}
