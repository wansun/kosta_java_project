package step10;

import java.util.TreeSet;

/* java.util.Collection 계열의 TreeSet 을 테스트
 * Set 계열은 요소로 같은 데이터 중복을 허용하지 않는 특징
 * Set interface 의 구상클래스(구현체) 인 TreeSet 은 정렬하는 기능을 내장
 */
public class TestSet {
	public static void main(String[] args) {
		// <E> : <String>  -> Generic : 요소 타입을 명시
		TreeSet<String> set=new TreeSet<String>();
		set.add("아이유");
		set.add("설현");
		set.add("아이유"); //동일한 데이터가 중복되므로 추가되지 않는다.
		set.add("김연아");
		System.out.println(set.size()); //3
		//TreeSet 이므로 정렬되어 출력된다
		System.out.println(set);
		System.out.println("*************");
		TreeSet<Integer> set2=new TreeSet<Integer>();
		set2.add(5);
		set2.add(3);
		set2.add(7);
		set2.add(3); //중복되어 추가되지 않는다.
		System.out.println(set.size());//3
		//TreeSet이므로 오름차순 정렬되어 출력된다
		System.out.println(set2);
		System.out.println(set2.descendingSet());
	}
}
