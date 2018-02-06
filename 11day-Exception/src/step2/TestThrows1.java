package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Memo{
	//throws는 readMemo() 메서드를 호출하는 곳으로
	//해당 Exception 발생시 던진다는것을 의미한다.
	public void readMemo(String fileName) throws FileNotFoundException,IOException {
		FileReader fr=null;
		BufferedReader br=null;
		try {
		fr=new FileReader(fileName);
		System.out.println(fileName+"읽다");
		br=new BufferedReader(fr);
		System.out.println("메모내용"+br.readLine());
		}finally {//어떤 상황에서든지 실행하겠다
			System.out.println("finally 실행 : Exception 던지기전에 항상 실행");
			if(br!=null)
			br.close();
		}
	}
}
public class TestThrows1 {
	public static void main(String[] args) {
		Memo memo=new Memo();
		String fileName="C://java-kosta//a.txt";//존재하는 파일
		//존재하지 않는 파일 정보를 입력해본다.
		//fileName="C://java-kosta//b.txt";
		try {
			memo.readMemo(fileName);
			System.out.println("메모를 읽은 후 후속작업");
		} catch (FileNotFoundException e) {
			e.printStackTrace();//예외 메세지와 발생 경로를 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("시스템 정상수행");
	}
}
