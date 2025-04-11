package Ex2;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int a[];
		a= new int[10];
		System.out.print("양의 정수를 10개를 입력하시오>>");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
			System.out.print("3의 배수는 : ");
			for(int i = 0; i< a.length; i++) {
			if(a[i]%3==0) {
				System.out.print(a[i]+" ");
				
				sc.close();
			}
		}
	}

}
