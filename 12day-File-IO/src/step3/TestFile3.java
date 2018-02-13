package step3;

import java.io.File;

public class TestFile3 {
	public static void main(String[] args) {
		File dir=new File("C:\\java-kosta\\test");
		//dir 디렉토리에 있는 파일명을 모두 출력
		String fa[]=dir.list();
		for(int i=0;i<fa.length;i++)
			System.out.println(fa[i]);
		System.out.println("*************");
		File[] fobj=dir.listFiles(); //배열 요소가 File 객체로 저장된 것을 반환
		for(int i=0;i<fobj.length;i++) {
			System.out.println("파일임?"+fobj[i].isFile());
			System.out.println(fobj[i].getName());
		}
	}
}
