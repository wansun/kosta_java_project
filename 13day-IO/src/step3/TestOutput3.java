package step3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestOutput3 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\order.txt";
		System.out.println("*** 점심메뉴 ***");
		Scanner s=new Scanner(System.in);
		try {
			PrintWriter pw=new PrintWriter(new FileWriter(path));
			while(true) {
				System.out.println("메뉴를 입력하세요.");
				String info=s.nextLine();
				if(info.equals("주문끝"))
				break;
				pw.println(info);
			}
			System.out.println("*** 주문완료 ***");
			s.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
