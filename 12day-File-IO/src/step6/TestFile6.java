package step6;

import java.io.File;
import java.io.IOException;

public class TestFile6 {
	public static void main(String[] args) {
		FileService service=new FileService();
		String path="C:\\java-kosta\\test\\media\\movie\\a.avi";
		
		try { 
			service.createDirAndFile(path);
			System.out.println(path+ " 파일생성");
		} catch (IOException e) {
			e.printStackTrace();  
		}
		
	}
}
