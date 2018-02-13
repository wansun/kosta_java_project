package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class TestOutout {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C:\\java-kosta\\test\\output.txt");
			PrintWriter pw=new PrintWriter(fw);
			for(int i=0;i<4;i++)
				pw.println("아이유");
			System.out.println("출력완료");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
