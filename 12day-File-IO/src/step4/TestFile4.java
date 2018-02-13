package step4;

import java.io.File;

public class TestFile4 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\util\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse";
		//위 경로 디렉토리 안에 있는 디렉토리를 제외한 파일명만 모두 출력
		File p=new File(path);
		
		File[] fobj=p.listFiles(); //항상 어디서 나오는지 생각!!!!!!
		for(int i=0;i<fobj.length;i++) {
			if(fobj[i].isFile()) {
				System.out.println(fobj[i].getName());
				//System.out.println(fobj[i].isFile());			
			}
		}
	}
}
