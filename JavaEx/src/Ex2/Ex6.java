package Ex2;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []unit = {50000,10000,1000,500,100,50,10,1};
		int m;
		int r;
		System.out.print("금액을 입력하시오>>");
		m = sc.nextInt();
		for(int i = 0; i < unit.length; i++) {
			r = m / unit[i];
			m = m % unit[i];
			if(r > 0 ) {
				System.out.print(unit[i]+"원 짜리 : " + r + "개 \n");
			}
		}
		
		sc.close();
	}

}
