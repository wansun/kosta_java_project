package step1;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	//java.io.File class 의 기능을 테스트하는 예제
	public static void main(String[] args) {
		File dir=new File("C:\\java-kosta");
		System.out.println(dir.exists()); //존재하면 true
		System.out.println(dir.isFile()); //파일이면 true. 디렉토리이므로 false
		System.out.println(dir.isDirectory()); //디렉토리이므로 false
		System.out.println(dir.getPath()); //경로 확인
		File dir2=new File(dir.getPath()+File.separator+"test");
		System.out.println(dir2.exists());
		boolean flag=dir2.mkdirs(); //디렉토리 생성
		System.out.println("디렉토리 생성"+flag);
		//dir2 경로에 a.txt. 파일을 생성
		File file1=new File(dir2.getPath()+File.separator+"a.txt");
		System.out.println(file1.getPath());
		try {
			boolean flas2=file1.createNewFile();
			System.out.println("파일생성 : "+flas2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file1.isFile());
		//fiel1 a.txt를 보유한 상위 디렉토리를 알고자 한다
		System.out.println(file1.getParent()); //Stirng으로 반환
		System.out.println(file1.getParentFile()); //file 객체로 반환
	}
}
