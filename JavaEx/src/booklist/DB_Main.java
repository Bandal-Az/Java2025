package booklist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class Book {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	public void printBook() {
		System.out.print(" " + bookid);
		System.out.print(" " + bookname);
		System.out.print(" " + publisher);
		System.out.print(" " + price);
		System.out.println();
	}

	public int getBookid() {
		return bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

class BookStore {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private Book books[];

	public BookStore() {
		books = new Book[10];

		for (int i = 0; i < 10; i++) {
			books[i] = new Book();
		}
	}

	public Book[] getBooks() {
		return books;
	}

	public void printBooks() {
		for (int i = 0; i < books.length; i++) {
			books[i].printBook();
		}

	}

	public void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##madang";
		String pwd = "c##madang";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getBookDB() {
		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("BOOK ID \tBOOK NAME \tPUBLISHER \t\tPRICE");

			int index = 0;
			while (rs.next()) {

				int bookid = rs.getInt(1);
				books[index].setBookid(bookid);
				String bookname = rs.getString(2);
				books[index].setBookname(bookname);

				String publisher = rs.getString(3);
				books[index].setPublisher(publisher);

				int price = rs.getInt(4);
				books[index].setPrice(price);
				;

				index++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

class Customer {
	private int custid;
	private String name;
	private String address;
	private String phone;

	public void printCustomer() {
		System.out.print(" " + custid);
		System.out.print(" " + name);
		System.out.print(" " + address);
		System.out.print(" " + phone);
		System.out.println();
	}

	public int getCustid() {
		return custid;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

class Customers {
	private Connection con; // 멤버변수
	private Statement stmt;
	private ResultSet rs;

	private Customer cu[];

	public Customers() {
		cu = new Customer[5];

		for (int i = 0; i < 5; i++) {
			cu[i] = new Customer();
		}
	}

	public Customer[] getcu() {
		return cu;
	}

	public void printcu() {
		for (int i = 0; i < cu.length; i++) {
			cu[i].printCustomer();
		}

	}

	public void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##madang";
		String pwd = "c##madang";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {

			con = DriverManager.getConnection(url, userid, pwd);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getCustomerList() {
		String query = "SELECT * FROM CUSTOMER";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("customer ID \tcustomer 이름 \t주소 \t전화번호");
			int index = 0;
			while (rs.next()) {
				int Custid = rs.getInt(1);
				cu[index].setCustid(Custid);
				;
				String Name = rs.getString(2);
				cu[index].setName(Name);

				String Address = rs.getString(3);
				cu[index].setAddress(Address);

				String Phone = rs.getString(4);
				cu[index].setPhone(Phone);
				;

				index++;
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public class DB_Main {
	public static void main(String args[]) {

		BookStore bs1 = new BookStore();
		bs1.getConn();
		bs1.getBookDB();

		Book[] books = bs1.getBooks();

		for (int i = 0; i < books.length; i++) {
			books[i].printBook();
		}

		System.out.println("--------------------");

		Customers cu1 = new Customers();
		cu1.getConn();
		cu1.getCustomerList();

		Customer[] cu = cu1.getcu();
		for (int i = 0; i < cu.length; i++) {
			cu[i].printCustomer();
		}

	}
}
