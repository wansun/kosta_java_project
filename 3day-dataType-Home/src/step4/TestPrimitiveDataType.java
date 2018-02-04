package step4;

public class TestPrimitiveDataType {
	public static void main(String[] args) {
	/*	// 정수형 데이터 타입 테스트 
		byte b1=1;
		System.out.println(b1);
		System.out.println(Byte.MAX_VALUE);//byte 형 최대값 
		System.out.println(Byte.MIN_VALUE);//byte 형 최소값 
		// b1=130; // byte 형 최대값을 넘으므로 error 
		short s=130; // 2 byte 이므로 가능 
		int i=1; // 4byte
		long lo=1L; // 8byte , L 은 long형 데이터임을 알린다 
		//실수형 
		//float fl=3.14; //실수형의 기본형은 double ( 8byte ) 
		float fl=3.14F; // F 는 float 형 데이터임을 알린다 
		double d=3.14;
		//문자형 , 한 문자만 가능 
		char c='a'; //문자열은 reference data type인 String을 사용 
		//논리형 true , false 만 가능 
		boolean bo=true;
		bo=false;
		//bo=ok;  논리형은 true false 만 가능 
		*/
		// type casting 사례 
		byte by1=10;
		byte by2=5;
		// by1+by2 의 연산결과 정수는 정수기본형 int로 인식되므로 error
		//byte by3=by1+by2; 
		//int in=by1+by2;
		//연산결과를 byte형으로 캐스팅하면 된다 
		byte by3=(byte)(by1+by2);
		System.out.println(by3);
		
	}
}









