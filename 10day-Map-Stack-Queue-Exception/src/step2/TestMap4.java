package step2;

import step1.Food;

public class TestMap4 {
	public static void main(String[] args) {
		FoodService service=new FoodService();
		Food f1=new Food("a","미래에셋백반",4500);
		service.addFood(f1);
		Food f2=new Food("b","쌀국수",8000);
		service.addFood(f2);
		Food f3=new Food("c","미래에셋백반",6000);
		service.addFood(f3);
		service.printAll();
		
		/* 음식명 : 미래에셋백반  가격 : 4500
		 * 음식명 : 감자탕  가격 : 20000
		 * 음식명 : 순대국  가격 : 6000
		 */
		
		System.out.println("             ");
		System.out.println("**** 아이디로 검색 ****");
		Food food=service.findFoodById("c");
		System.out.println(food); //c 순대국 6000
	}
}
