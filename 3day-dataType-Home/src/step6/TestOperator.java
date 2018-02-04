package step6;

public class TestOperator {
	//연산자
	public static void main(String[] args) {
		int i=7;
		int j=3;
		System.out.println(i*j);//곱하기
		System.out.println(i/j);//나누기
		System.out.println(i%j);//나눈 후 나머지 
		System.out.println(i=j);//대입 or 할당 
		System.out.println(i==j);//같은 지 비교 
		boolean flag=false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("***증감연산자***");
		int k=7;
		System.out.println(k++);//실행 후 증가 
		System.out.println(k);//8
		System.out.println(++k);//9 증가 후 실행 
		System.out.println(k);//9 
		System.out.println(--k);//8
		System.out.println(k--);//8
		System.out.println(k);//7
		System.out.println("****");
		int money=100;
		// money 에 200을 추가 
		//money=money+200;
		// 위 라인을 줄여서 표현하면 아래와 같다 
		money+=200;
		System.out.println(money);//300
		// money 를 200 감소해본다 
		money-=200;
		System.out.println(money);//100
		System.out.println("*****삼항연산자*****");
		int x=10;
		/* (조건식) ? 식1 : 식2 
		 * 조건식이 참이면 식1을 수행하고 거짓이면 식2를 수행한다 
		 */
		int result=(x<0)?x+1:x+2;
		System.out.println(result);
		/*
		 *  and 연산과 or 연산 
		 *  
		 *  and 연산 ( && ) 
		 *  
		 *  true && true  -> true 
		 *  false && true -> false
		 *  true && false -> false 
		 *  false && false -> false 
		 *  
		 *  or 연산 ( || )
		 *  true || true -> true
		 *  true || false -> true 
		 *  false || true -> true 
		 *  false || false -> false 
		 */
	}
}


































