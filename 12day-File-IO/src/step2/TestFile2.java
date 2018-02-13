package step2;

import java.io.File;
import java.io.IOException;

public class TestFile2 {
	public static void main(String[] args) {
		File f1=new File("C:\\java-kosta\\test\\a.txt");
		//System.out.println(f1.isFile());
		//f1과 동일한 위치에 b.txt 파일을 생선한다.

		
		File f2=new File(f1.getParentFile()+File.separator+"b.txt");
		try {
			System.out.println(f2.getName()+"파일생성"+f2.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
