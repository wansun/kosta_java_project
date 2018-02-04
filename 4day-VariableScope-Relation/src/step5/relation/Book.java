package step5.relation;

public class Book {
	private String write;
	private String title;
	
	public Book(String write, String title) {
		this.write=write;
		this.title=title;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
