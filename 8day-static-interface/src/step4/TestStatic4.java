package step4;

public class TestStatic4 {
	//java api 에서 제공하는 static field(상수와 변수)와 method 사용
	public static void main(String[] args) {
		// int형의 최대값
		// static field이므로 클래스명으로 접근한다
		System.out.println(Integer.MAX_VALUE);
		String s1="1";
		String s2="2";
		System.out.println(s1+s2);
		//Integer class 의 static method인 parseInt() 를 이용해 문자열을 
		//int 형으로 변환
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		System.out.println(num1+num2);
	}
}
