package Ex;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int a = scanner.nextInt();
		int b = a / 50000;
		int c = (a % 50000) / 10000;
		int d = ((a % 50000) % 10000) / 1000;
		int e =(((a %  50000 ) % 10000)% 1000)/500;
		int f =((((a % 50000 ) % 10000)% 1000)%500)/100;
		int g =(((((a % 50000 ) % 10000)% 1000)%500)% 100)/50;
		int h =((((((a % 50000 ) % 10000)% 1000)%500)% 100)% 50)/10;
				
		System.out.println("오만원권 " + b + "매" );
		
		System.out.println("만원권 " + c + "매" );
		
		System.out.println("천원권 " + d + "매" );
		
		System.out.println("오백원 " + e + "매" );
		
		System.out.println("백원 " + f + "매" );
		
		System.out.println("오십원 " + g + "매" );
		
		System.out.println("십원 " + h + "매" );
		
		scanner.close();
		}

}
