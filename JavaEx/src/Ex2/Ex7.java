package Ex2;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		int a[] = new int[10];
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10 + 1);
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.print("\n" + "평균은" + sum / a.length);
		sc.close();
	}
}
