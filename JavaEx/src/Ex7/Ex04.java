package Ex7;
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("2000~2009년 까지 1년 단위로 키(cm)를 입력");
		System.out.print(">>");
		for (int i = 0; i < 10; i++) {
			int b = sc.nextInt();
			v.add(b);
		}
		int m = 0;
		int mi = 0;
		for (int i = 0; i < 9; i++) {
			if (m < v.get(i+1) - v.get(i)) {
				m = v.get(i+1) - v.get(i);
				mi = 2000 + i;
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 " + mi + "년 " + (double)m  +"cm");
		sc.close();
	}
	
//	120 122 125 130 139 160 169 173 175 179

}
