package step2;

import java.util.Iterator;
import java.util.LinkedHashMap;

import step1.Food;

public class FoodService {
	LinkedHashMap<String, Food> map=new LinkedHashMap<String, Food>();
	
	public void addFood(Food f) {
		map.put(f.getId(), f);
	}

	public void printAll() {
		Iterator<Food> it=map.values().iterator();
		while(it.hasNext()) {
			Food f=it.next();
			System.out.println("음식명 : "+f.getName()+"  가격 : "+f.getPrice());
		}
	}

	public Food findFoodById(String id) {

		return map.get(id);
	}

}
