package prj3;

public class Book1 {
	String title;
	String author;
	void show() {System.out.println(title + " " + author);}
	
	public Book1() {
		this("","");
		System.out.println("생성자 호풀됨");
	}
	
	public Book1(String title) {
		this(title, "작가미상");
	}
	
	public Book1(String title, String author) {
		this.title = title; this.author = author;
	}
}
