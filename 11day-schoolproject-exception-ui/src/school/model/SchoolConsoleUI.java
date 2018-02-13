package school.model;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolConsoleUI {
	//private SchoolService service();
	//private Scanner scanner();
	
	
	public void execute() {
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("1"+".추가 ");
		list.add("2"+".삭제 ");
		list.add("3"+".검색 ");
		list.add("4"+".전체회원보기 ");
		list.add("5"+".종료");
		System.out.println("**** 학사관리 프로그램을 시작합니다 ****");
		System.out.println(list.get(0)+list.get(1)+list.get(2)+list.get(3)
							+list.get(4));
		String info=s.nextLine();
		int i=0;
		while(info.equals("6")) {
		switch (info) {
			case "1":
				System.out.println("1");
				break;
			case "2":
				System.out.println("2");
				break;
			case "3":
				System.out.println("3");
				break;
			case "4":
				System.out.println("4");
				break;
			case "5":
				System.out.println("5");
				break;
			}
		}
	}
}
 