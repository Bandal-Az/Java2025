package Ex4;
import java.util.Scanner;
public class StringStack implements Stack {
	private int i = -1, length = 0, capacity;

	private String [] A;
	public StringStack() {
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		Scanner sc = new Scanner(System.in);
		this.capacity = sc.nextInt();
		A = new String[capacity];
	}

	public int length() {

		return length;
	}

	public int capacity() {

		return capacity;
	}

	public String pop() {
		i++;
		return  A[i];
	}

	public boolean push(String val) {
	if(length >= capacity) {
		return true;
	}
	else {
		A[length] = val;
		length++;
		return false;
	}
	}

}
