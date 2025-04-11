package prj3;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Book2[]book = new Book2[2];
		
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			book[i] = new Book2(title, author);
		}
		for(int i=0; i<book.length; i++) 
		System.out.print("(" + book[i].title + "," + book[i].author + ")");
		
		sc.close();
	}

}
