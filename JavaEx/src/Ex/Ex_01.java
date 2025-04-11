package Ex;
import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int a = scanner.nextInt();
		double b = a / 1216.0;
		b=(int)(b*100)/100.0;
		
		
		System.out.print( a + "원은 " + '$' + b + "입니다." );
		
		
		scanner.close();
	}

}