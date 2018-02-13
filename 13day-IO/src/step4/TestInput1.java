package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput1 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\menu.txt";
		try {
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			while(br.ready());
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
