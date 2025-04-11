package Ex3;
import java.util.Scanner;
public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수를 입력>>");
		int m = sc.nextInt();
		int s = sc.nextInt();
		int e = sc.nextInt();
		Grade me = new Grade(m, s, e);
		System.out.println("평균은 " + me.average());
		sc.close();
	}

}
