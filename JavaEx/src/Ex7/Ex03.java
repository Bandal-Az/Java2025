package Ex7;
import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("에스프레소", 2000);
		h.put("아메리카노", 2500);
		h.put("카푸치노", 3000);
		h.put("카페라떼", 3500);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");

		while (true) {
			System.out.print("주문 >> ");
			String a = sc.next();
			if (a.equals("그만")) {
				break;
			}
			Integer b = h.get(a);
			System.out.println(a + "는 " + b + "입니다.");

		}

	}

}
