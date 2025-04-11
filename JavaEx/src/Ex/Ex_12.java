package Ex;
import java.util.Scanner;
public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("연산>>");
		int a = scanner.nextInt();
		String s = scanner.next();
		int b = scanner.nextInt();
		int x = 0;
		
		switch(s){
			case "+":
				x = a + b ;
				break;
			case "-":
				x = a - b ;
				break;
			case "*":
				x = a * b ;
				break;	
			case "/":
				x = a / b ;
				break;	
		}
		
		
		if(s.equals("+")) {
			x = a + b;
		}
		if(s.equals("-")) {
			x = a - b;
		}
		if(s.equals("*")) {
			x = a * b;
		}
		if(s.equals("/")) {
			x = a / b;
		}
		System.out.println(a + s + b + "의 계산 결과는" + x);
		
		scanner.close();	
	}
 
}
