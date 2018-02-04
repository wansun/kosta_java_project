package step5.relation;

public class TestAggregation2 {
	public static void main(String[] args) {
		//aggregation : has a 연습
		Student st=new Student("아이유",new Book("헉슬리","멋진신세계"));
		System.out.println(st.getName()); //아이유
		System.out.println(st.getBook().getWrite()); //헉슬리
		System.out.println(st.getBook().getTitle()); //신세계
	}
}
