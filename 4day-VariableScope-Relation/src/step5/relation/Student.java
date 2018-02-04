package step5.relation;

public class Student {
	private String name;
	private Book book;
	
	public Student(String name, Book book) {
		this.name=name;
		this.book=book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
