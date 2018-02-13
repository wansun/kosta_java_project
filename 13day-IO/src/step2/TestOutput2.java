package step2;

import java.io.FileWriter;
import java.io.PrintWriter;


public class TestOutput2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\menu.txt";
		try {
		PrintWriter pw=new PrintWriter(new FileWriter(path));
		pw.println("pizza");
		System.out.println("success");
		pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
