package Ex7;
import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while (true) {
			System.out.print("이름과 포인트 입력>>");
			String a = sc.next();
			if (a.equals("exit")) {
				System.out.print("프로그램을 종료합니다...");
				break;
			}
			int a2 = sc.nextInt();
			if (h.containsKey(a)) {
				int p = h.get(a);
				p += a2;
				h.put(a, p);
			} else {
				h.put(a, a2);
			}

			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();

			while (it.hasNext()) {
				String key = it.next();
				int value = h.get(key);
				System.out.print("(" + key + "," + value + ")");
			}
			System.out.println();
		}
		sc.close();
	}

}
