package step1;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		//TreeSet : Set계열이므로 중복허용하지 않고
		//          TreeSet은 정렬기능을 내장한다.
		TreeSet<String> set=new TreeSet<String>();
		set.add("아이유");
		// set.add(1); //Generic을 String으로 선언했으므로 문자열만 저장가능
		set.add("김연아");
		set.add("손연재");
		set.add("아이유"); //Set 이므로 중복허용x, 추가 안됨
		System.out.println(set); //3명이 정렬되어 출력된다.
		System.out.println("*******************");
		//중복허용하지 않고 추가 순서대로 저장된다.
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(100);
		set2.add(300);
		set2.add(200);
		set2.add(100); //중복되므로 추가안됨
		System.out.println(set2); //추가한 순서대로 출력된다.
	}
}
